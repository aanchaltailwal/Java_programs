import mypkg.*;
public class MyCalcTest {

	public static void main(String[] args) {
		MyCalc ob = new MyCalc();
		System.out.println(ob.sum(10,25));
		System.out.println(ob.diff(10,22));
		System.out.println(ob.mul(10,12));
		System.out.println(ob.div(10,2));
	}
}
