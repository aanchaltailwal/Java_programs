import java.util.Scanner;
public class Experiment1 {
	public static void main(String[]args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers you want to enter");
		n = sc.nextInt();
		int[] array = new int[10];
		int temp = 0;
		System.out.println("Enter the marks of the students");
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt( );
		}
		System.out.println("Array elements are");
		for(int i=0; i<n; i++) {
			System.out.println(array[i]);	
		}
		 for (int i = 0; i < array.length; i++) {     
	            for (int j = i+1; j < array.length; j++) {     
	               if(array[i] > array[j]) {    
	                   temp = array[i];    
	                   array[i] = array[j];    
	                   array[j] = temp;    
	               }     
	            }     
	        }    
	          
	        System.out.println();    
	        System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < array.length; i++) {     
	            System.out.print(array[i] + " "); 
	        }
	            
	        for(n=0; n<array.length; n++) {
	        	System.out.println("Square is:");
	        	System.out.println(array[n] + (int)Math.pow(array[n], 2));
		        
	        }
	        
	}
}

	        

