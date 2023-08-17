class Employee{
	int id;
	String name;
}
public class Custom_Class {
	public static void main(String[]args) {
		System.out.println("This is our custom class");
		Employee Aanchal = new Employee();// Intantiating a new emplyee object
		
		//setting attributes
		Aanchal.id = 12;
		Aanchal.name = "CodeWithMe";
		
		//printing the attributes
		System.out.println(Aanchal.id);
		System.out.println(Aanchal.name);
	}

}
