
public interface ConnectionInt {
	
	//���������� ������
	void onConnectionReady (Connection connection);
	//������� ���������
	void onReceiveString(Connection connection, String value);
	//������ ����������
	void onConnection(Connection connection);
	//����������
	void onException(Connection connection, Exception e);
}
