import java.util.Scanner;
public class PractceSet_4 {
	public static void main(String[]args) {
//1st QUESTION
		int a = 10;
		if(a == 11) {
			System.out.println("I am 11");
		}
		else {
			System.out.println("I am not 11");	
		}
//2ND QUESTION
		byte m1, m2, m3;
		System.out.println("Enter your marks");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your physics marks");
        m1 = sc.nextByte();
        System.out.println("Enter your maths marks");
        m2 = sc.nextByte();
        System.out.println("Enter your chemistry marks");
        m3 = sc.nextByte();
        
        float avg = (m1+m2+m3)/3.0f;
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {
        	System.out.println("You are pass");
        }
        else {
        	System.out.println("Yoo are fail");
        }
        
//3RD QUESTION
        Scanner pc = new Scanner(System.in);
        System.out.println("enter your income in lakhs");
         float tax = 0;
         float income = pc.nextFloat();
         if(income<=2.5) {
        	 tax = tax+0;
         }
         else if(income>2.5 && income<=5.0) {
        	 tax = tax + 0.05f*(income - 2.5f);	 
         }
         else if(income>5f && tax <10f) {
        	 tax = tax + 0.05f * (5.0f - 2.5f);
        	 tax = tax + 0.05f * (income - 5f);
         }
         else if(income>10.0f) {
        	 tax = tax + 0.05f * (5.0f - 2.5f);
        	 tax = tax + 0.05f * (10.0f - 5f);
        	 tax = tax + 0.3f * (income - 10.0f);
        }
         System.out.println("The total tax paid by the employee is: "+tax);

//4TH QUESTION
         Scanner dc = new Scanner(System.in);
         System.out.println("Enter th enumber for day");
         int day = dc.nextInt();
         switch(day) {
         case 1:
        	 System.out.println("Monday");
        	 break;
         case 2:
        	 System.out.println("Tuesday");
        	 break; 
         case 3:
        	 System.out.println("Wednesday");
        	 break;
         case 4:
        	 System.out.println("Thursday");
        	 break;
         case 5:
        	 System.out.println("Friday"); 
        	 break;
         case 6:
        	 System.out.println("Saturday");
        	 break;
         case 7:
        	 System.out.println("Sunday");
        	 break;
         }
         
//6th QUESTION
       System.out.println("enter the website");
       Scanner gc = new Scanner(System.in);
       String website = gc.next();
       if(website.endsWith(".org")) {
    	   System.out.println("This is an organization website");
       }
       else if(website.endsWith(".com")) {
    	   System.out.println("This is Commercial Website");
       }
       else if(website.endsWith(".in")){
    	   System.out.println("This is an India website");  
       }
	}
}
