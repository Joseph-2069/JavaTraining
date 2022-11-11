package Java8;

public class GenericClassEx {

	public static void main(String[] args) {
//		initialize generic class with Integer data
		GenericsClass<Integer> intObj = new GenericsClass<>(5);
		System.out.println("Generic ckass returns"+intObj.getdata());
		
//		initialize generic class with String
		GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
		System.out.println("Generic class returns"+stringObj.getdata());

	}
	}
	
	 class GenericsClass<t>{   // the <t> makes this generic function
//		variable of t type
		private t data;
		
		public GenericsClass(t data) {
			this.data=data;
		}
//		method that return t type variable
		public t getdata() {
			return this.data;
		}
	}

