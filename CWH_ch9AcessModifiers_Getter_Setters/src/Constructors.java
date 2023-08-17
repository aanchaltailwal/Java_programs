
class MyMainEmployee{
	private int id;
	private String name;
	
	public MyMainEmployee() { // You can also pass arguments here
		id = 56;  
		name = "Aanchal";
	}
	
	public String getName() { return name;}
	public void setName(String n) {this.name = n;};
    public void setId(int i) {this.id = i;}
	public int getId() { return id;}
}
public class Constructors {
	public static void main(String[]args) {
		MyMainEmployee Aanchal = new MyMainEmployee(); //Arguments value
		System.out.println(Aanchal.getId());
		System.out.println(Aanchal.getName());
				
				

			}
}


