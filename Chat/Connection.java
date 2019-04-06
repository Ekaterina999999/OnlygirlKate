import java.io.*;

import java.net.Socket;

public class Connection {

	private final Socket socket;
	private final Thread myThread;
	private final BufferedReader in;
	private final BufferedWriter out;
	private ConnectionInt listener;

	public Connection(ConnectionInt listener, String ipAdress, int port) throws IOException {
		this(listener, new Socket(ipAdress, port));
	}
	public Connection(ConnectionInt listener, Socket socket) throws IOException {
		this.socket = socket;
		this.listener = listener;
		in  = new BufferedReader(new InputStreamReader (socket.getInputStream()));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		myThread = new Thread(new Runnable() {
			public void run(){
				try {
					listener.onConnectionReady(Connection.this);
					while (!myThread.isInterrupted()) {
						listener.onReceiveString(Connection.this, in.readLine());
					}
					
				} catch (IOException e) {
					listener.onException(Connection.this, e);
				} finally {
					listener.onConnection(Connection.this);
				}
			}
		});
		myThread.start();
	}
	
		
	public synchronized void sendString(String value) {
		try {
			out.write(value + "\r\n");
			out.flush();
		} catch (IOException e) {
			listener.onException(Connection.this, e);
			disconnect();
		}
	}
	
	public synchronized void disconnect() {
		myThread.interrupt();
		try {
			socket.close();
		} catch (IOException e) {
			listener.onException(Connection.this, e);
		}
	}
	
	public String toString() {
		return "Connection: " + socket.getInetAddress () + "Port:" + socket.getPort();
	}
}
