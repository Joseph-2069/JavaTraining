package AbstractClassPractice;

public abstract class Bike {
	private int speed;
	private String ModelName,Specifications;
	Bike(int speed,String ModelName,String Specifications){
		this.speed = speed;
		this.ModelName=ModelName;
		this.Specifications=Specifications;
	}
	public int getSpeed() {
		return speed;
	}
	
	public String getModelName() {
		return ModelName;
	}
	public void setModelName(String modelName) {
		ModelName = modelName;
	}
	public String getSpecifications() {
		return Specifications;
	}
	public void setSpecifications(String Specifications) {
		this.Specifications = Specifications;
	}
	
	public abstract int Speed();
	public abstract String Model();
	public abstract String Specification();
	
}
