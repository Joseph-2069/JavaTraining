package Java8.LamdaFunctionApplication;
 interface calculator{
	void sum(int x, int y);
};
public class CalculatorSum{
	public static void main(String[] args) {
		calculator c  = (x,y)-> System.out.println(x+y);
		c.sum(20, 20);;
	}
}
