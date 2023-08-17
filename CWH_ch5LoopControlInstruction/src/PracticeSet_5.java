 
public class PracticeSet_5 {
	public static void main(String[]args) {

//1ST QUESTION
		int n=4;
		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
 
//2ND QUESTION
		int sum=0;
		int m=4;
		for(int i=0; i<m; i++) {
			sum= sum + (2*i);
		}
		System.out.print("Sum of even number is:");
		System.out.print(sum);
 
//3RD QUESTION
		int s=5;
		for(int i=0 ; i<=10; i++) {
			System.out.printf("%d x %d = %d\n",s, i, s*i);
		}

//4TH QUESTION
		int l=10;
		for(int i=10 ; i>=1; i--) {
			System.out.printf("%d x %d = %d\n",l, i, l*i);
		}

//6TH QUESTION
		int j=5;
		//what is factorial n= n * n-1 * n-2 * n-3....1
		//5!= 5*4*3*2*1
		int i =1;
		int factorial =1;
		while(i<=j) {
			factorial *= i;
			i++;
		}
		System.out.println(factorial);

//9TH QUESTION
		int p=8;
		int summ=0;
		for(int I=1 ; I<=10; I++) {
			summ += p*I;
	}
		System.out.println(summ);
}
}
