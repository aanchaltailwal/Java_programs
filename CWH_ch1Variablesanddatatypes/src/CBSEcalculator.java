import java.util.Scanner;
public class CBSEcalculator {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your physics marks");
		float sub1 = sc.nextFloat();
		System.out.println("Enter your chemistry marks");
		float sub2 = sc.nextFloat();
		System.out.println("Enter your mathematics marks");
		float sub3 = sc.nextFloat();
		System.out.println("Enter your english marks");
		float sub4 = sc.nextFloat();
		System.out.println("Enter your hindi marks");
		float sub5 = sc.nextFloat();
		
		float percentage= ((sub1 + sub2 + sub3 + sub4 + sub5)/500)*100;
		System.out.println("percentage:");
		System.out.println(percentage);
	}

}
