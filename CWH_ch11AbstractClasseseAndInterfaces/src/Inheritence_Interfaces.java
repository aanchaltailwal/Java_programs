interface sampleInterface{
	void meth1();
	void meth2();
}
interface childSampleInterface extends sampleInterface{ //inheritence
	void meth3();
	void meth4();
}
class MySampleClass implements childSampleInterface{
	public void meth1() {
		System.out.println("meth3");
	}
	public void meth2() {
		System.out.println("meth3");
	}
	public void meth3() {
		System.out.println("meth3");
	}
	public void meth4() {
		System.out.println("meth3");
	}
}
public class Inheritence_Interfaces {
	public static void main(String[]args) {
		
	}

}
