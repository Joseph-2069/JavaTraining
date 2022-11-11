package InterfaceEx;

public class Ball implements Bounceable{
	private int bf;
	private String color;
	
	public Ball(String ballcolor) {
		super();
		this.color = ballcolor;
		
	}
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getBf() {
		return bf;
	}
	public void setBf(int bf) {
		this.bf = bf;
	}
	
	@Override 
	public void bounce() { // we need to set it to public as we need to set the visibility
		System.out.println("it is a "+this.color+" color ball bouncing with a ball factor of "+this.bf);
	}
	public void setBounceMultiple(int multiple) {// we need to set it to public as we need to set the visibility
		this.bf =Bounceable.BOUNCE_FACTOR * multiple;
	}

}

/*  
 * 
 * 
 * MAAM'S CODE
  public class Ball implements Bounceable {
	
	private int bf;
	
	private String color;
	
	
	
   public Ball(String ballcolor) {
		super();
		this.color=ballcolor;
	}



    public String getColor() {
	return color;
}



  public void setColor(String color) {
	   this.color = color;
   }



	public void bounce()
    {
       System.out.println("It's a "+ this.color+ " color ball bouncing with bounce factor = "+this.bf);	
    }
	
	public void setBounceMultiple(int multiple)
	{
		
		this.bf = Bounceable.BOUNCE_FACTOR * multiple;
		
	}
	

}

 */
