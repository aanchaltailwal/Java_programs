class MyThr1 extends Thread{
	public MyThr1(String name) { // constructor
		super(name);
	}
	public void run() {
		int i = 34;
		
		while(i<100) {
			//System.out.println("I am a thread");
			System.out.println("thankyou " + this.getName());
			i++;
		}
	}
}
public class ThreadPriorities {
	public static void main(String[]args) {
		MyThr1 t1 = new MyThr1("Aanchal 1");
		MyThr1 t2 = new MyThr1("Aanchal 2");
		MyThr1 t3 = new MyThr1("Aanchal 3");
		MyThr1 t4 = new MyThr1("Aanchal 4");
		MyThr1 t5 = new MyThr1("Aanchal 5(most important)");
		t5.setPriority(Thread.MAX_PRIORITY);
		//t1.setPriority(Thread.MIN_PRIORITY);
		//t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		//t4.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}
