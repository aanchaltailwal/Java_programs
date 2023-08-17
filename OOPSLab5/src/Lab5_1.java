
interface bikeBMW{
	int speed = 90;
	public void distance();
}
interface bikeNINJA{
	int distance = 100;
	public void speed();
}
class bike implements bikeBMW, bikeNINJA{
	
	public void distance() {
	int distance = speed*100;
	System.out.println("distance travelled is " + distance);	
}
	public void speed() {
		int speed = distance/100;
	}
}
public class Lab5_1{
	public static void main(String[]args) {
		bike obj = new bike();
		obj.distance();
		obj.speed();	
	}
}