class Base{
	int x;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		System.out.println("I am in base and setting x now");
		this.x = x;
	}
	public void printMe(){
		System.out.println("I am a constructor");
	}
}

class Derived extends Base{    // here we can use same properties also can add more
	int y;
	
	public int getY() {
		return y ;
	}
	public void setY(int y) {
		System.out.println("I am in derived and setting y now");
		this.y = y;
    }
}
public class Inheritence {
	public static void main(String[]args) {
		Base b = new Base();        //creating an object of base class
		b.setX(4);
		System.out.println(b.getX());
		Derived d = new Derived();  // creating an object of derived class
		d.setY(49);
		System.out.println(d.getY());
		
		
	}

}
