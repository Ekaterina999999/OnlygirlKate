
public class Task1 {

	public static void main(String[] args) {
		// Arguments are read from the command line
		//int a = Integer.valueOf(args[0]);
		//int b = Integer.valueOf(args[1]);
		int a = 42;
		int b = 42;
		
		
		if ((a < 0) || (b < 0)) {
			System.out.println("There is a negative number");
		}
		
		if (b != 0) {
			float c = ((float) a)/ b;
			System.out.println("b not equal 0");
			System.out.printf("Division result: %f\n", c);
		}else {
			System.out.println("b равно 0");
		}
		
		if (a>b) {
			System.out.println("The first number is greater than the second");
		}else if (b == a) {
			System.out.println("Numbers are equal");
		}else {
			System.out.println("The second number is greater than the first");
		}
		
		if (a%2 == 0) {
			System.out.println("Number а = " + a +" even");
		}
	}

}
