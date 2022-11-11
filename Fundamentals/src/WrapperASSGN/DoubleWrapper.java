package WrapperASSGN;

public class DoubleWrapper {

	public static void main(String[] args) {
		Double d = 32.33;
		
		
		byte b = d.byteValue();
		System.out.println("byte value " + b);
		
		int i = d.intValue();
		System.out.println("int value "+i);
		
		short sh = d.shortValue();
		System.out.println("short value "+sh);
	
		long l =d.longValue();
		System.out.println("long value "+l);
		float f = d.floatValue();
		System.out.println("float value "+f);
		String s = d.toString();
		System.out.println("string value "+s);
		
		Byte B = b;
		System.out.println("Byte object "+ B);
		Integer I=i;
		System.out.println("Integer object "+ I);
		Short Sh =sh;
		System.out.println("Short object "+ Sh);
		Long L =l;
		System.out.println("long object "+ L);
		Float F =f;
		System.out.println("Float object "+ F);
		
			
	
	}

}
