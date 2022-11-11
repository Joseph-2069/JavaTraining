package lambdaExpreseeion;

public class AddEx implements Addition{
	public int sum(int a,int b) {
		return a+b;
	}
	
	public static void main(String[]args) {
		Maths((a,b)->{return a+b;});
	}
		public static void Maths(Addition ab) {
			int total = ab.sum(20 ,30);
			System.out.println(total);
		}
	

	
	
}
