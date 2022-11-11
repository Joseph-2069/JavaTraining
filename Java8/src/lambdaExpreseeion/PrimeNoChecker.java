package lambdaExpreseeion;
interface prime{
	boolean checkPrime(int a);
}
public class PrimeNoChecker implements prime{
	
	public static void main(String[] args) {
//		checkPrime(a -> {
//			return true;
//		
//		});
	}
	public boolean checkPrime(int a) {
		int count =0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count>1) {
			return true;
		}else return false;
	}
	
	
}


