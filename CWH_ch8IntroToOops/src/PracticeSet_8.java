class Employee{
	int salary;
	String name;
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String n){
		name =n;
	}
}
//problem2
class CellPhone{
	public void ringing() {
		System.out.println("ringing...");
	}
	public void vibrating() {
		System.out.println("vibrating...");
	}
	public void callFriend() {
		System.out.println("call..");
	}
}
//problem3
class Square{
	int side;
	public int area() {
		return side*side;
	}
	public int perimeter(){
		return 4*side;
	}
}
public class PracticeSet_8 {
	public static void main(String[]args) {
// problem1
		Employee Aanchal = new Employee();
		Aanchal.setName("code with me");
		System.out.println(Aanchal.getName());	
// problem2
		CellPhone asus = new CellPhone();
		asus.callFriend();
		asus.vibrating();
		asus.ringing();
//problem3
		Square sq = new Square();
		sq.side = 4;
		System.out.println(sq.area());
		System.out.println(sq.perimeter());
 	}
}
