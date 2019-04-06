import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

//PORT 54145
//IP 109.194.230.189    
public class ServerChat implements ConnectionInt {
	
	public static void main (String[] args) {
		
		new ServerChat();
		
	}
	
	private final ArrayList<Connection> connections = new ArrayList();
	
	private ServerChat() {
		System.out.println("Server running ..");
		try(ServerSocket serverSocket = new ServerSocket(138)){
			while(true) {
				try{
					new Connection(this, serverSocket.accept());
				}catch (IOException e){
					System.out.println("Exception");
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	@Override
	public synchronized void onConnectionReady(Connection connection) {
		connections.add(connection);
		sendMessAll("Client connection: " + connection);
		
	}
	@Override
	public synchronized void onReceiveString(Connection connection, String value) {
		sendMessAll(value);
		
	}
	@Override
	public synchronized void onConnection(Connection connection) {
		connections.remove(connection);
		sendMessAll("Client disconnection: " + connection);
		
	}
	@Override
	public synchronized void onException(Connection connection, Exception e) {
		System.out.println("Connection exception" + e);
		
	}
	
	private void sendMessAll(String value) {
		System.out.println(value);
		for (int i = 0; i < connections.size(); i++) connections.get(i).sendString(value);
	}
	
	
}
