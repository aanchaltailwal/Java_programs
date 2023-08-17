
public class Methods {
	int logic (int x, int y) {
		int z;
		if(x>y) {
			 z= x+y;
		 }
		 else {
			 z = (x+y)*5;
		 }
		return z;
		
	}
	public static void main(String[]args) {
		 int a = 5;
		 int b = 7;
		 int c ;
//for calling a method if not static
// Method invocation using object creation
		 Methods obj = new Methods();
		 c = obj.logic(a, b);
// if static
		// c = logic(a , b);
		 int a1 = 2;
		 int b1 = 1;
		 int c1;
// Method invocation using object creation
		 Methods obj1 = new Methods();
		 c1 = obj1.logic(a1, b1);
//for static
		//c1 = logic(a1, b1);
		 System.out.println(c);
		 System.out.println(c1);
		 }

}
