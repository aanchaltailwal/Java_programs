class MyNewThr1 extends Thread{
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("thankyou:");
			i++;
		}
	}
}
class MyNewThr2 extends Thread{
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("thankyou so much:");
			i++;
		}
	}
}
public class ThreadJoinMethods {
	public static void main(String[]args) {
		MyNewThr1 t1 = new MyNewThr1(); 
		MyNewThr2 t2 = new MyNewThr2();
		t1.start();
		try {
			t1.join();                     //JOIN METHOD
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	    t2.start();
	}

}
