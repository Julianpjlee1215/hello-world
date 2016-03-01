import java.util.Scanner;

public class HelloWorld {
	private static Scanner scanner  = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int s1 = scanner.nextInt();
		int s2 = scanner.nextInt();
		int s3 = scanner.nextInt();
		double average = (s1+s2+s3)/3;
		System.out.println(average);
	}

}
