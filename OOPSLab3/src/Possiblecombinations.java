import java.util.Scanner;
public class Possiblecombinations {
		public static void main(String[] args) {
			System.out.println("enter the numbers");
			Scanner sc =  new Scanner(System.in);
			System.out.println("enter the first numbers");
			int num1= sc.nextInt();
			System.out.println("enter the second numbers");
			int num2= sc.nextInt();
			System.out.println("enter the third numbers");
			int num3= sc.nextInt();
			
			int arr[] = {num1, num2, num3};
			
			for (int x = 0; x < 3; x++) {
				for (int y = 0; y <3; y++) {
					for (int z = 0; z <3; z++) {
						if (arr[x] != arr[y]&& arr[y] != arr[z] && arr[z] != arr[x]) {
							System.out.println(arr[x] + "" + arr[y] + "" + arr[z]);
						}
					}
				}
			}
		}

}
