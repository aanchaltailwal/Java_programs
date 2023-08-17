class MyThread1 extends Thread{
	public void run() {
		int i = 0;
		while(i<100) {
			System.out.println("My thread is running");
			System.out.println("i am happy!");
			i++;
		}	
	}
}
class MyThread2 extends Thread{
	public void run() {
		int i = 0;
		while(i<100) {
			System.out.println("thread2 is good");
			System.out.println("i am sad!");
			i++;
		}	
	}
}
public class ThreadbyExtendingThreadClass {
	public static void main(String[]args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
	}

}
