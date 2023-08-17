
public class VarArgs {
//	static int sum(int a, int b) {
//		return a+b;
//	}
	static int sum(int ...arr) {
		int result = 0;
		for(int a : arr) {
			result += a;
		}
		return result;
	}
	public static void main(String[]args) {
		System.out.println("Welcome to Varargs Tutorial");
		System.out.println("The sum of 4 and 5 is:" + sum( 4,5));
		System.out.println("The sum of 4,67 and 5 is:" + sum( 4,5,67));
		System.out.println("The sum of 3,4,67 and 5 is:" + sum(3,4,5,67));
	}

}
