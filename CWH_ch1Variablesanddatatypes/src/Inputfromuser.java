import java.util.Scanner;
public class Inputfromuser {
	public static void main(String[]args) {
		System.out.println("Taking input from user");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("The Sum Of Two Numbers:");
		System.out.println(sum);			 
	}
}
