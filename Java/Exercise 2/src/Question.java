import java.util.Locale;

public class Question {
	public static void main(String[] args) {
		// QS1 Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số nguyên đó
		int a = 5;
		System.out.printf("%d%n", a);
	
		//QS2 Question 2:  Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh 
		//System out printf để in ra số nguyên đó thành định dạng như sau: 100,000,000 
		
		int b = 100000000;
		System.out.printf(Locale.US, "%,d%n", b);
		
		//Question 3:  Khai báo 1 số thực = 5,567098 và sử dụng lệnh 
		//System out printf để in ra số thực đó chỉ bao gồm 4 số đằng sau 
		
		float c = 5.567098f;
		System.out.printf("%5.4f%n", c);
	
	}
}
