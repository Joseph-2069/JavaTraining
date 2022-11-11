package Fundamentals;
import java.util.Scanner;

public class LargestNumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int no1=-1,no2=-1,no3=-1;
		
		
		
		
//		
//		
//		boolean r =sc.hasNextInt();
//		
//		System.out.println(r);

		
		
		System.out.println("Enter the First Number");
		if(sc.hasNextInt()) {
			
			no1= sc.nextInt();
		}
		
		System.out.println("Enter the Second Number");
		if(sc.hasNextInt()) {
			
			no2= sc.nextInt();
		}
		
		System.out.println("Enter the Third Number");
		if(sc.hasNextInt()) {
			no3= sc.nextInt();
		}
		
		if(no1!=-1&&no2!=-1&&no3!=-1) {
			if(no1>no2&& no1>no3) {
				System.out.println("No.1 is the greatest");
			}
			else if(no2>no1 && no2>no3) {
				System.out.println("No.2 is the greatest");
			}else {
			System.out.println("No.3 is the greatest");
			}
		}
		
	}

}
