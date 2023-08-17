
public class IntroToArray {
	public static void main(String[]args) {
//1ST METHOD
		int [] marks = new int[5];
		marks[0] = 100;
		marks[1] =60;
		marks[2] =56;
		marks[3] =34;
		marks[4] =99;
		System.out.println(marks[3]);
		
//2ND METHOD
		int[] students = new int[5];
		students[0] = 0;
		students[1] =600;
		students[2] =46;
		students[3] =35;
		students[4] =91;
		System.out.println(students[4]);
//3RD METHOD
		int[] school = {100, 56, 78, 33, 10};
		System.out.println(school[2]);
	}
}
