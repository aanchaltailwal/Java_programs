class Cylinder1{
	private int radius;
	private int height;
	
	public Cylinder1(int radius,int height) {
		this.radius = radius;
		this.height = height;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.radius = height;
}
public class PracticeSet_9usingConstructors {
	public static void main(String[]args) {
		Cylinder1 myCylinder = new Cylinder1(12,9);
		System.out.println(myCylinder.getHeight());
		System.out.println(myCylinder.getRadius());		
	}
}
}
