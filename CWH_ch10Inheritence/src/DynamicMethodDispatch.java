class Phone{
	public void greet() {
		System.out.println("gud mrng");
	}
	public void name() {
		System.out.println("My name is java");
	}
	
}
class SmartPhone extends Phone{
	public void name() {
		System.out.println("My name is java in class 2");
	}
	public void sagat() {
			System.out.println("apka swagat hai");
		}
}
public class DynamicMethodDispatch {
	public static void main(String[]args) {
		//Phone obj = new Phone();
		//SmartPhone smobj = new SmartPhone();
		//obj.name();
		Phone obj = new SmartPhone();
		obj.name();
		//SmartPhone obj = new Phone();// this is wrong
		
	}

}
