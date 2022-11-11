package Java8;
interface Addable{
	int add(int a,int b);
}
public class LambdaFunctionalInterfaceExercise {
	public static void main(String[]args) {
		Addable ob= new Calculator();
		
		int r = ob.add(10,20);
		System.out.println(r);
		meth(ob);
		meth(new Calculator());
		
		System.out.println("Implementing functional interface Adable on fly using Lamda Expression");
		Addable ob1=(a,b)-> a+b;
	}
	
	static void meth(Addable ref) {
		int r = ref.add(10, 20);
		System.out.println("Addition done using Lambda function");
	}
}

class Calculator implements Addable{
	public int add(int a,int b ) {
		return a+b;
	}
}


