
public interface ConnectionInt {
	
	//Соединение готово
	void onConnectionReady (Connection connection);
	//Принять сообщение
	void onReceiveString(Connection connection, String value);
	//Разрыв соединения
	void onConnection(Connection connection);
	//Исключение
	void onException(Connection connection, Exception e);
}
