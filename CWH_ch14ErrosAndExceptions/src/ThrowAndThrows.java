
public class ThrowAndThrows {
	public static int divide(int a, int b) throws ArithmeticException {
		//Made by harry
		int result = a/b;
		return result;
	}
	public static void main(String[]args) {
		//Shivam- uses divide function created by harry
		try {
			int c = divide(6,0);
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("exception is here");
		}
		
		
	}

}
