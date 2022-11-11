package Interface;

public class Tyre implements Bounceable{
	private int bf;
	private String color;
	Tyre(String color){
		this.color = color;
	}
	public void SetBounceFactor(int val) {
		this.bf = val;
	}
	public void bounce() {
		System.out.println("The tyre is bounceing with a bounce factor of"+this.bf);
	}
}
