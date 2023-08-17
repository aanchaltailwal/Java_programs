
public class Stringmethods {
	public static void main(String[]args) {
		String name = new String("Aanchal");        //how to make a string
		System.out.println(name);
		                                         // name.length() method
		int len = name.length();
		System.out.println(len);
		                                         // name.toLowerCase() mathod
		String lowerst = name.toLowerCase();
		System.out.println(lowerst);
		                                         // name.toUpperCase() method
    	String upperst = name.toUpperCase();
		System.out.println(upperst);
		
		System.out.println(name.substring(4));    //substring method
		
		System.out.println(name.substring(2,6));   // substring method(start,end)
		
		System.out.println(name.replace('c','p')); //  namw.replace method
		
		System.out.println(name.startsWith("Aan")); //name.startsWith method
		
		System.out.println(name.endsWith("hal"));   // name.endsWith method
		
		System.out.println(name.charAt(4));           //name.charAt method
		
		System.out.println(name.indexOf("n"));        // name.indexOf method
		
		System.out.println(name.indexOf("n",5));      // name.indexOf method
		
	}

}
