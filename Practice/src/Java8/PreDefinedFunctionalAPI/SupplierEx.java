package Java8.PreDefinedFunctionalAPI;
import java.util.function.Supplier;
public class SupplierEx {
	public static void main(String[] args) {
		Supplier<String> supplier = ()-> "Hola";
		
		System.out.println( supplier.get());
			
	}
	
	

}
