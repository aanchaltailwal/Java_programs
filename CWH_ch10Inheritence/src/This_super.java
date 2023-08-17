class EkClass{
	int a;
	
	public int getA() {
		return a;
	}
	EkClass(int v){
		a=v;// we can also rite this here this.a=v  here this is a referrence
	}
	public int returnone() {
		return 1;
	}
}
public class This_super {
	public static void main(String[]args) {
		EkClass e = new EkClass(5);
		System.out.println(e.getA());
	}

}
