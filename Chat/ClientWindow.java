import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;


	public class ClientWindow extends JFrame implements ActionListener, ConnectionInt{

		private static final String IP_ADRESS = "11.11.1.1";
		private static final int PORT = 138;
		private static final int WIDTH = 1000;
		private static final int HEIGHT = 600;
		
		public static void main (String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new ClientWindow();
				}
			});
		}
		
		private final JTextArea log  = new JTextArea();
		private final JTextField fieldNickname = new JTextField("Kate");
		private final JTextField inputText = new JTextField();
		
		private Connection connection;
		
		private ClientWindow() {
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			setSize(WIDTH,HEIGHT);
			setLocationRelativeTo(null);
			log.setEditable(false);
			log.setLineWrap(true);
			add(log, BorderLayout.CENTER);
			add(inputText, BorderLayout.SOUTH);
			inputText.addActionListener(this);
			add(fieldNickname, BorderLayout.NORTH);
			setVisible(true);
			try {
				connection = new Connection(this, IP_ADRESS, PORT);
			} catch (IOException e) {
				printMess("Connection exception: " + e);
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			String mess = inputText.getText();
			if (mess.equals("")) return;
			inputText.setText(null);
			connection.sendString(fieldNickname.getText() + ": " + mess);
		}

		@Override
		public void onConnectionReady(Connection connection) {
			printMess("Connection ready..");
			
		}

		@Override
		public void onReceiveString(Connection connection, String value) {
			printMess(value);
			
		}

		@Override
		public void onConnection(Connection connection) {
			printMess("Connection close");
			
		}

		@Override
		public void onException(Connection connection, Exception e) {
			printMess("Connection exception: " + e);
			
		}
		
		private synchronized void printMess(String mess) {
			SwingUtilities.invokeLater(new Runnable() {

				@Override
				public void run() {
					log.append(mess + "\n");
					log.setCaretPosition(log.getDocument().getLength());
					
				}
				
			});
		}
	}

