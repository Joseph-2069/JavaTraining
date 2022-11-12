package ClassObject;
import java.util.Scanner;

public class customExceptionExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Account ob = new Account("Joseph Vibin Verghese",101,2000,101);
		
		Scanner sc = new Scanner(System.in);
		String r;
		
		do
		{
			System.out.println("Enter the amt to withdraw in multiples of 1000:");
			double amt = sc.nextDouble();
			double bal=ob.getBalance();
			
			try
			{
				amt = ob.withdraw(amt);
			
			}catch(InsufficientBalanceException e)
			{
				System.out.println(e);
				break;
			}catch(ZeroBalanceException e) {
				System.out.println(e);
			}
			System.out.println("Do you wish to continue:(y/n):");
			 r =  sc.next();
			
			
		}while(r.charAt(0)=='y'||r.charAt(0)=='Y');

		
		sc.close();
		System.out.println("program ends here..");
	}
}
