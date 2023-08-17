import java.util.Scanner;
public class HandlingExceptions {
	public static void main(String[]args) {
		int[] marks = new int [3];
		marks[0] = 7;
		marks[1] = 56;
		marks[2] = 6;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array index");
		int ind = sc.nextInt();
		
		System.out.println("enter the no. you want to divide the value with");
		int number = sc.nextInt();
		try {
			System.out.println("the value at array index enetred is :" + marks[ind]);
			System.out.println("the value at array-value/number is :" + marks[ind]/number);
		}
	    catch(Exception e) {
	    	System.out.println("some exception occured");
	    }
	
	}

}

