package Java8.PreDefinedFunctionalAPI;
import java.util.function.Consumer;
public class ConsumerEx{

//	@Override
//	public void accept(Integer t) {
//		System.out.println("Print : "+t);
//
//	}
//	
	public static void main(String[] args) {
		Consumer<Integer> consumer = (i)->System.out.println("Print   " +i);
		consumer.accept(100);
	}
	

}
