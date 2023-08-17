package mypkg;

public class MyCalc {
	public int sum(int a, int b) {
		return(a+b);
	}
	public int diff(int a, int b) {
		return(a-b);
	}
	public int mul(int a, int b) {
		return(a*b);
	}
	public int div(int a, int b) {
		return(a/b);
	}

	public static void main(String[] args) {
		MyCalc ob = new MyCalc();
		System.out.println(ob.sum(10,2));
		System.out.println(ob.diff(10,2));
		System.out.println(ob.mul(10,2));
		System.out.println(ob.div(10,2));
	}

}
