import java.util.Scanner;
public class Practiceset_2 {
	public static void main(String[]args) {
//QUESTION 2
		//Incrementing grade by 8
		char grade = 'B';             
		grade = (char)(grade + 8);   //Type casting
		System.out.println(grade);
		
		//Decrementing grade by 8
		grade = (char)(grade - 8);  //Type casting
		System.out.println(grade);
		
//QUESTION 3
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a>80);
		
//QOESTION 4
		
		
//QUESTION 5
		int d = 7;
		int e = 7*49/7+35/7;
		System.out.println(e);
				
		
	
		
	}

}
