
public class MethodsInArray {
	public static void main(String[]args) {
//ARRAY LENGTH
		int[] marks = {98, 45, 78, 12, 34, 67};
		String [] students = {"Aanchal", "Sukhii", "Anushka", "Abhinav"};
		System.out.println(marks[1]);
		System.out.println(marks.length);
		System.out.println(students[3]);
		System.out.println(students.length);
		
//DISPLAYING AN ARRAY
	//printing using naive way
		System.out.println("displaying array using naive way");
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		System.out.println(students[3]);
//printing using loops
		System.out.println("displaying array using for loop");
		for(int i=0; i<students.length; i++) {
			System.out.println (students[i]);
		}
//QUICK QUIZ
		System.out.println("printing marks in reverse order");
		for(int j= marks.length-1; j>=0; j--) {
			System.out.println(marks[j]);
//FOR-EACH LOOP IN JAVA
			System.out.println("using for-each loop in java");
			for(int element: marks) {
				System.out.println(element);
			}
		}
	}

}
