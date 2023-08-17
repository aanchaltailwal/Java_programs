interface Bicycle{
	int a = 45;
	void applyBreak(int decrement);
	void speedUp(int increment);
}
class AvonCycle implements Bicycle{ //why to use interface over classes
	//B eacause in class e can extend only one but in interface e can implement many at a same time
	//Ex: Avon implements bicycle implements cycle
	void bloHorn() {
		System.out.println("pee peee pooo pooo");
	}
	public void applyBreak(int decrement) {
		System.out.println("Applying break");
		
	}
	public void speedUp(int increment) {
		System.out.println("speed up");
	}
	
}
public class Interfaces {
	public static void main(String[]args) {
		AvonCycle cycleHarry = new AvonCycle();
		cycleHarry.applyBreak(1);// you can create properties in interfaces
		System.out.println(cycleHarry.a);
	}

}
