
public class Task1 {

	public static void main(String[] args) {
		// Arguments are read from the command line
		
		//int a = Integer.valueOf(args[0]);
		//int b = Integer.valueOf(args[1]);
		int a = 42;
		int b = 0;
		
		
		if ((a<0)||(b<0)) {
			System.out.println("���� ������������� �����");
		}
		if (b!=0) {
			float c = ((float) a)/((float) b);
			System.out.println("b �� ����� 0");
			System.out.printf("��������� �������: %f\n", c);
		}else {
			System.out.println("b ����� 0");
		}
		if (a>b) {
			System.out.println("������ ����� ������ �������");
		}else {
			System.out.println("������ ����� ������ �������");
		}
		if (a%2 == 0) {
			System.out.println("����� � = " + a +" ������");
		}
	}

}
