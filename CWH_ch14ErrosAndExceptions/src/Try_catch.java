
public class Try_catch {
	public static void main(String[]args) {
		int a = 6000;
		int b = 0; //arithmetic exception
		try {
			int c = a/b;
			System.out.println("the result is " + c);
		}
		catch(Exception e) {
			System.out.println("we failed to divide Reason:");
			System.out.println(e);
		}
		System.out.println("end of the programme");
	}

}
