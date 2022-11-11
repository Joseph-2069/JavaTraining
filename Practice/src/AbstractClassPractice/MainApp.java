package AbstractClassPractice;

public class MainApp {

	public static void main(String[] args) {
		Bike b = new RoyalEnfield(140,"Classic 350","Halogen Setup");
		Bike b1 = new Honda(150,"Hi-ness","LED Setup");
		
		System.out.println(b.getModelName());
		System.out.println(b.getSpeed());
		System.out.println(b.getSpecifications());
		System.out.println();
		System.out.println(b1.getModelName());
		System.out.println(b1.getSpeed());
		System.out.println(b1.getSpecifications());
		
	}

}
