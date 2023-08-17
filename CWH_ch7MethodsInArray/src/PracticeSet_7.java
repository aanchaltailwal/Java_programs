
public class PracticeSet_7 {
//1st question
	static void multiplication(int n) {
		for(int i=1; i<=10; i++) {
			System.out.println(n*i);
		}
	}
//2nd question
	static void pattern1(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//3rd question
	static int sumRec(int n) {
		if(n==1) {
			return 1;
		}
		return n + sumRec(n-1);
	}
//4th question
	static void pattern2(int n) {
		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}		
	public static void main(String[]args) {
		multiplication(7);
		pattern1(4);
		int c= sumRec(3);
		System.out.println(c);
		pattern2(4);

		
	}

}
