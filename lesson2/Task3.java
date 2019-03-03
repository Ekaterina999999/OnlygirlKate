import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter matrix:");
		int n = 8, sum = 0;
		int matrix[] = new int[n];
		int max = 0;
		for (int i = 0; i<n; i++) {
			matrix[i]=input.nextInt();
			
		}
		for (int i=0;i<n;i++) {
			if ((max<matrix[i])&&(matrix[i]!=100500)) {
				max = matrix[i];
		}
	}
		System.out.println(max);
}}
