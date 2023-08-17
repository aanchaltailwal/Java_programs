abstract class Parent{
	public Parent(){
		System.out.println("base 2 constructor");
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	abstract public void greet();
	abstract public void greet2();
}

class Child2 extends Parent{
	public void greet(){
		System.out.println("Good morning");
}
	public void greet2(){
		System.out.println("Good evening");
}
public class Abstract {
	public static void main(String[]args) {
		Child2 c = new Child2(); 
		//Parent p = new Parent();    // not allowed because they are abstract classes
	}
  }
}
