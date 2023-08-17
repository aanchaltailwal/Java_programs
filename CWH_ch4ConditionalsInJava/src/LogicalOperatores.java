
public class LogicalOperatores {
	 public static void main(String[]args) {
//AND LOGICAL OPERATOR
		 boolean a = true;
		 boolean b = false;
		 boolean c = true;
		 if(a && b && c) {
			 System.out.println("YES");
		 }
		 else {
			 System.out.println("NO ");
		 }
//OR LOGICAL OPERATOR
		 boolean d = true;
		 boolean e = false;
		 boolean f = true;
		 if(d || e || f) {
			 System.out.println("YES");
		 }
		 else {
			 System.out.println("NO ");
		 } 
//NOT OPERATOR
		 boolean g = true;
		 boolean h = false;
		 boolean i = true;
		 System.out.println("For logical opt");
		 System.out.print("Not(g) is ");
		 System.out.println(!g);
		 System.out.print ("Not(h) is ");
		 System.out.println(!h);
	 }

}
