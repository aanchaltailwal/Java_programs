class MyThreadRunnable1 implements Runnable{
	public void run() {
		int i = 0;
		while(i<100) {
		    System.out.println("i am a thread 1 not a threat1");// use while loop to print multiple time
		    i++;
		}
	}
	
}
class MyThreadRunnable2 implements Runnable{
	public void run() {
		int i = 0;
		while(i<100) {
		   System.out.println("i am a thread 2 not a threat2");
		   i++;
		}
	}
}
public class ThreadbyRunnableInterface {
	public static void main(String[]args) {
		MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
		Thread gun1 = new Thread(bullet1);
		MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
		Thread gun2 = new Thread(bullet2);
		gun1.start();
		gun2.start();
	}

}
