import java.util.Scanner;
public class Hello_name {
	public static void main(String[]args) {
		System.out.println("Taking input from user:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
//		System.out.print("Hello ");
//	    System.out.print(name);
//       System.out.print(" have a good day");
		
		System.out.println("hello " + name + " have a good day");
	}

}
