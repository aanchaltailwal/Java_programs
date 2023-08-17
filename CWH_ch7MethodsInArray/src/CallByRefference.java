//void function tellJoke
// call by value & call by referrence
public class CallByRefference {
//	static void change(int a) {
//		a = 99;
//	}
	static void change2(int[] arr) {
		arr[0] = 99999;
	}
	//static void tellJoke() {
	//	System.out.println("I invented a new word!\n" + "Plagiarism");
	//}
	public static void main(String[] args) {
		//tellJoke();
		//int [] marks = {12, 56, 77, 89, 99, 94};
//changing the integer
		//int x = 45;
		//change(x);
		//System.out.println(" the value of x after running change is: "+ x);
//changing the array
		int [] marks = {12, 56, 77, 89, 99, 94};
		change2(marks);
		System.out.println(" the value of x after running change is: "+ marks[0]);
		
	}

}
