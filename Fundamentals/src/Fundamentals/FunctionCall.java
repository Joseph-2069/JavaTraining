package Fundamentals;
import java.util.Scanner;
public class FunctionCall {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = sc.nextLine();
		
		FunctionCall ob = new FunctionCall();
		ob.greet(name);
		greet1(name);
		
	}
	public void greet(String name) {
		System.out.println("Hey this is "+ name);
	}
	public static void greet1(String name) {
		System.out.println("hello i am "+ name);
	}

}
