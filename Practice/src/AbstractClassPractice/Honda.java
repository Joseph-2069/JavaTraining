package AbstractClassPractice;

public class Honda extends Bike{
	
	Honda(int speed , String ModelName ,String Specification){
		super(speed,ModelName,Specification);
	}
	public int Speed(){
		return this.getSpeed();
	}
	public String Model() {
		return this.getModelName();
	}
	public String Specification() {
		return this.getSpecifications();
	}
	}
