
public class BreakAndContinue {
	public static void main(String[]args) {
		//BREAK AND CONTINUE USING LOOPS;
		for(int i=0; i<5; i++) {
			System.out.println(i);
			System.out.println("Java is great");
			if(i==2) {
				System.out.println("Ending the loop");
				break;
			}
		}
//BREAK WITH LOOPS
		int j=0;
		while(j<5) {
			System.out.println(j);
			System.out.println("Java is great");
			if(j==2) {
				System.out.println("Ending the loop");
				break;
		}
			j++;
				
	}
		System.out.println("Loop ends here");
//CONTINUE STATEMENT
		for(int i=0; i<5; i++) {
			if(i==2) {
				System.out.println("We skip here one element and then will continue");
				continue;
	}
			System.out.println(i);
		}
//CONTINUE FOR DO-WHILE LOOP
		int i=0;
		do {
			i++;
			if(i==3) {
				System.out.println("We skip a num here using do-while loop");
				continue;
			}
			System.out.println("THIS IS A NUM:");
			System.out.println(i);
		}while(i<5);
		System.out.println("LOOP ENDS HERE");	
	}
}
	

