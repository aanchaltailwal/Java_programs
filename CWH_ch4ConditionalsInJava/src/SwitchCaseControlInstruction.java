import java.util.Scanner;
public class SwitchCaseControlInstruction {
	public static void main(String[]args) {
		int age;
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		switch (age) {
		    case 18:
		    	System.out.println("You are going to become an Adult");
		    	break; 
		    case 21:
		    	System.out.println("You are going to join a job");
		    	break; 
		    case 45:
		    	System.out.println("You are going to retire");
		    	break; 
		    default:
		    	System.out.println("Enjoy your life");  
		}
		System.out.println("Thanks for using my java code");
	}

}
