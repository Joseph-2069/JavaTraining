package lambdaExpreseeion;

import java.util.ArrayList;

/*
 * Syntax : parameter -> expression
 * 
 * A Lambda expression is a short block of code which is taken in parameters and returns a value.
 * Lambda expression are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
 * 
 * syntax parameter "x" is also a a parameter
 * for(int i :n){
 * 
 * System.out.println(t)
 *  }
 * just like for method has a parameter"i" which is used to iterate through the loop ""
 * -To use more than one parameter wrap them in parenthesis:
 * parameter1,parameter2)-> expression    // x -> system.out.println(x);
 * 
 * 
 * In order to do more complex operations, a code block can be used with curly braces.
 * (parameter1,parameter2)-> { code block }
 * 
 * NOTE: if the lambda expression needs to return a value,then the code block should have a return statement.
 * 
 * 
 * 
 * 
 * 
 * */
public class lambdaEx {

	public static void main(String[] args) {
		
		ArrayList<Integer>num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(0);
		num.forEach(n-> System.out.println(n));

	}

}
