
abstract class Pen{
	abstract void write();
	abstract void refill();
}
class FountainPen extends Pen{
	void write() {
		System.out.println("write");
	}
	void refill() {
		System.out.println("refill");
	}
	void changeNib() {
		System.out.println("changing the nib");
	}
}
public class PracticeSet_11 {
	public static void main(String[]args) {
		FountainPen pen = new FountainPen();
		pen.changeNib();		
	}
}
