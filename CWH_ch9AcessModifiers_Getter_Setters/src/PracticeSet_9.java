class Cylinder{
//PROBLEM 1 using getter and setters
	private int radius;
	private int height;	
	
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
		this.height = height;
	}
}
public class PracticeSet_9 {
	public static void main(String[]args) {
//PROBLEM 1
		Cylinder myCylinder = new Cylinder();
		myCylinder.setHeight(12);
		int h = myCylinder.getHeight();
		System.out.println(myCylinder.getHeight());
		myCylinder.setRadius(9);
		System.out.println(myCylinder.getRadius()); 
		
		
	}

}
