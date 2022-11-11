package Java8;

import java.util.function.BiFunction;

public class GenericMethod {
	public static void main(String[] args) {
		GenericMethod obj = new GenericMethod();
		obj.<Integer>showData(10);
		obj.<String>showData("Joseph");
		
		int r=obj.<Integer>addData(10,20,(a,b)->a+b);
		System.out.println("r ="+r);
		
		String str = obj.<String>addData("Joseph ","Verghese",(a,b)->a+b);
		System.out.println("str = "+str);
	}
	
	

	<t> void showData(t element) {
		System.out.println(element.getClass().getName() + element);
	}
	


	/*
	 * <t>t addData(t e1 , t e2){ return e1+e2; }
	 */
	
	
//	|||||||||||||||This is used to add data in generic method|||||||||||||||
	
	<t> t addData(t e1,t e2,BiFunction<t,t,t> bif) { //BiFunction is used to override and return the addition
//							BiFunction<no1,no2,return>
		return bif.apply(e1,e2);
	}
}
