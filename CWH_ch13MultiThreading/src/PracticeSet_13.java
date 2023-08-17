class Practice extends Thread{
	public void run() {
		int i = 0;
		while(i<100) {
			System.out.println("Good morning");
			i++;
		}
		
	}
}
class Practice1 extends Thread{
	public void run() {
		int i = 0;
		while(i<100) {
			System.out.println("Welcome");
			i++;
		}
		
	}
}
public class PracticeSet_13 {
	public static void main(String[]args) {
		Practice t1 = new Practice();
		Practice1 t2 = new Practice1();
		t1.start();
		t2.start();	
	}
}
