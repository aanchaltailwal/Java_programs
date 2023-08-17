
class MyThr extends Thread{
	public MyThr(String name) {       //Constructor
		super(name);
	}
	public void run() {
		int i = 34;
		System.out.println("thankyou");
		//while(i<100) {
		//	System.out.println("I am a thread");
		//	i++;
		//}
	}
}
public class ThreadUsingConstructors {
	public static void main(String[]args) {
		MyThr t = new MyThr("Aanchal");
		t.start();
		System.out.println("the Name of thread t is  " + t.getName());
		System.out.println("the Id of thread t is  " + t.getId());
		
		
	}
}
