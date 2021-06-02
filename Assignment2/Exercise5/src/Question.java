import java.text.ParseException;
import java.util.Scanner;

public class Question {
	public static void main(String[] args) throws ParseException {

		Scanner scanner = new Scanner(System.in);

		// Q1.
		System.out.println("Moi ban nhap vao 3 so nguyen duong ");
		for (int i = 0; i < 3; i++) {
			int x = scanner.nextInt();
			System.out.println("Ban da nhap: " + x + "\n");
		}
	
		System.out.println("Moi ban nhap vao 2 so thuc");
		for (int i = 0; i < 2; i++) {
			double d = scanner.nextDouble();
			System.out.println("Ban da nhap: " + d + "\n");
		}
	}
}