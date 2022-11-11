package Interface;
/*
 * Interface Keyword is used to initialize.
 * 
 * All methods are public final static by default
 * 
 * only public, abstract, default, static and strictfp are permitted
 * 
 * Abstract methods do not specify a body in interface
 * 
 * INterface Uses Implements to use parent class methods........
 * 
 * Interface Do not have constructors
 * 
 * Interface cannot create objects of itself
 * 
 * */

public interface Bounceable {// All methods in Bounceable interface need to be implemented
	int bF =5;
	void SetBounceFactor(int val);
	void bounce();
//	void getFactor() { //Abstract methods do not specify a body
//		return this.bF;
//	}

}

