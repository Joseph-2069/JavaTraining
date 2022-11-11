package ExceptionHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CheckException {

	public static void main(String[] args) {
		System.out.println("Program Execution Started");
		try {
			FileReader fr =new FileReader("/Fundamentals/src/ClassObj/Employee.java");
			
			System.out.println((char)fr.read());
			fr.close();
		}catch(FileNotFoundException e) {
			System.out.println("There is some error in the program");
		}
		catch(IOException e) {
			System.out.println("There is some error in the program");
	}
		System.out.println("remaining program continues.....");
}
	}
