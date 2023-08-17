import java.util.Scanner;

public class Nested_try_catch {
	public static void main(String[]args) {
		int[] marks = new int [3];
		marks[0] = 7;
		marks[1] = 56;
		marks[2] = 6;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the index");
		int ind = sc.nextInt();
		try {
			System.out.println("welcome to video on 82");
			try {
				System.out.println(marks[9]);
			}
			catch(Exception e) {
				System.out.println("sorry this does not exist");
				System.out.println("Exception in level 2");
			}
		}
		catch(Exception e) {
			System.out.println("Exception in level 1");
			
		}
	}

}
