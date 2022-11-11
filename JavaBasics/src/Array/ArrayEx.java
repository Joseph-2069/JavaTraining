package Array;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		
		
		
//		OLD FOR LOOP:
//		------------------------------------------------
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("Enter a number  : ");
//			int a = sc.nextInt();
//			arr[i]=a;	
//		}
		
//		for(int i=0 ;i <arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		
//		for(int i : arr) {
//			System.out.println(i);
//			
//		}
//		
		String [] str = new String[5];
		str[0]="Happy";
		str[1]="LOL";
		str[2]="QuEuE";
		for(String a: str) {
			if(a!=null) {
			System.out.println(a.toLowerCase()+" "+ a.length());
		}}
		
		
		sc.close();}

}
