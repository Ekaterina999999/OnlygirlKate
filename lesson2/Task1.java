
public class Task1 {

	public static void main(String[] args) {
		// Arguments are read from the command line
		
		//int a = Integer.valueOf(args[0]);
		//int b = Integer.valueOf(args[1]);
		int a = 42;
		int b = 0;
		
		
		if ((a<0)||(b<0)) {
			System.out.println("Есть отрицательное число");
		}
		if (b!=0) {
			float c = ((float) a)/((float) b);
			System.out.println("b не равно 0");
			System.out.printf("Результат деления: %f\n", c);
		}else {
			System.out.println("b равно 0");
		}
		if (a>b) {
			System.out.println("Первое число больше второго");
		}else {
			System.out.println("Второе число больше первого");
		}
		if (a%2 == 0) {
			System.out.println("Число а = " + a +" четное");
		}
	}

}
