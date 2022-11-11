package ArrayEx;

public class Array {

	public static void main(String[]args) {
//		int [] arr;
//		arr=new int[5];//int[] arrx = new int[5]
//						// array object of int primitives
//		//initialise the array 
//		for(int i=0;i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		//iterate array using for each loop
//		for(int n:arr) {
//			System.out.println(n);
//			
//			
//		}
		
		String[]arr1 = new String[3]; //array object of string references
		arr1[0]="Joseph";
//		System.out.println(arr1[0].toLowerCase());
		for(String s: arr1) {
			System.out.println(s.toLowerCase());
		}
	}
}
