
public class Insert {
 public static void main(String args[])
 {
	 StringBuffer sb=new StringBuffer("abcdefghijk");
	 sb.insert(3, 123);
	 System.out.println(sb);
	 
//reverse
	StringBuffer str=new StringBuffer("Hello World");
	str.replace(3, 8,"java");
	System.out.println(str);
	 
//capacity
	StringBuffer string = new StringBuffer("hello Anushka & Aanchal");
	System.out.println(string.capacity());
	
 }
}


