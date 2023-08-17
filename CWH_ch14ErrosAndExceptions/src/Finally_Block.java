
public class Finally_Block {
	public static void main(String[]args) {
		try {
			int a = 5;
			int b = 0;
			int c = a/b;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("this is the end of code");
			//finally block will run even try is returned..
		}
		
	}

}
