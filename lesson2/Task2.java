import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter matrix:");
		int n = 8, sum = 0;
		int matrix[] = new int[n];
		for (int i = 0; i < n; i++) {
			matrix[i] = input.nextInt();
			sum += matrix[i];
		}
		System.out.println("Summa:" + sum);
				
		for (int i = 0; i < n; i++) {
			if (matrix[i] > 1000) {
				System.out.println("Massiv - massivni");
				break;
			}
		}
	}
}