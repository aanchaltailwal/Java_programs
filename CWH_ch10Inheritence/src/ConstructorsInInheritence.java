class Base1{
	Base1(){
		System.out.println("I am a base class constructor");
	}
	Base1(int a){      // Constructor overloading
		System.out.println("I am an overloading base class constructor with value of a as:"+ a);
	}
	public int x;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}
class Derived1 extends Base1{
	Derived1(){
		//super(0); // If i want to print overloading base constructor
		System.out.println("I am a derived class constructor");
	}
	Derived1(int x, int y){ 
		super(x);
		System.out.println("I am an overloading derived class constructor with value of a as:"+ y);
	}
	public int y;
	public int getY() {
		return y;
	}
	public void setX(int y) {
		this.y = y;
	}
}
class childDerived extends Derived1{
	childDerived(){
		System.out.println("I am a child derived class constructor");
	}
	childDerived(int x, int y, int z){ 
		super(x,y);
		System.out.println("I am an overloaded const. of child derived class:"+ y);
	}
	public int y;
	public int getY() {
		return y;
	}
	public void setX(int y) {
		this.y = y;
	}
}
public class ConstructorsInInheritence {
	public static void main(String[]args) {
		Base1 b = new Base1();
		Derived1 d = new Derived1();
		childDerived cd = new childDerived();
		
	}

}
