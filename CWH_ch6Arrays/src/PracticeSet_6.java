
public class PracticeSet_6 {
	public static void main(String[]args) {
//1st Question
		 float[] marks = { 45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
		 float sum = 0;
		 for(float element: marks) {
			 sum= sum + element;
		 }
		 System.out.println("The value of sum is:"+ sum);
//2ND QUESTION
		 
		 int[] mark = {23,56,22,45,99};
		 int num = 576;
		 boolean isInArray = false;
		 for(int element: mark) {
			 if(num==element) {
				 isInArray = true;
				 break; 
			 }
		 }
		 if(isInArray) {
			 System.out.println("the value is present in the array");
		 }
		 else {
			 System.out.println("the value is not present in the array");
		 }
		 
		}
	
		
	}


