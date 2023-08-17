import java.util.Scanner;
public class Errors {
	public static void main(String[]args) {
		int a= 5;     // no semicolon is syntax error
		System.out.println(a); // what is b here
		
		for(int i=1; i<5; i++) {     //logical error
			System.out.println(2*i*1);
		}
		//Runtime errors
		int k;
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		System.out.println("integer part of 1000 divided by k is" + 1000/k);
	     // here if user will input 0 it will throw runtime error
	}

}
