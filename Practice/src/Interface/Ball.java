package Interface;
//All methods in Bounceable interface need to be implemented
public class Ball implements Bounceable{
	//if all the methods are not implemented in the sub class of parent interface then abstract keyword is used
	private int bf;
	
	String color;
	Ball(String color){
			
			this.color = color;
	}
	public void SetBounceFactor(int val){
		this.bf= Bounceable.bF*val;
		
	}
	
	public void bounce() {
		System.out.println( "ball is bouncing with bounce factor "+this.bf);
	}
	

}
