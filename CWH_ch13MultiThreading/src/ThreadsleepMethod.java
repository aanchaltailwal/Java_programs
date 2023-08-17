class MyNewThread1 extends Thread{
	public void run() {
		int i=0;
		while(i<10) {
			System.out.println("thankyou:");
			try {
				Thread.sleep(1000);        // IT WILL SLEEP FOR 1000 SEC BEFORE PRINTING
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
}

public class ThreadsleepMethod {
	public static void main(String[]args) {
		MyNewThread1 t1 = new MyNewThread1(); 
		t1.start();
	}

}

