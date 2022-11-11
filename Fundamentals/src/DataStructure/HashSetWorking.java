package DataStructure;

public class HashSetWorking {

//	add an emp ele --> e1 (deptno=10,empid=1)
//
//	 
//
//	hashcode() --> return this.deptno --> 10
//
//	 
//
//	10 --> e1
//
//	 
//
//
//	add e2 (deptno=20,empid=2)
//
//	 
//
//	20 --> e2
//
//	 
//
//
//	add e3 (deptno=10,empid=3)
//
//	 
//
//	10 --> e1
//
//	 
//
//	e3.equals(e1) --> false  //overriden equals compared based on empid
//
//	 
//
//	10 --> e1,e3
//
//	 
//	
//	add e4(deptno=10,empid=3)//duplicate= meanongfully it represents the same emp app-wise/real-life wise
//	
//	hashcode ->10
//	
//	10 --> e1,e3
//	e4.equals(e1)-->false
//	e4.equals(e3) -->true (as empid of both of them is 3 i.r. same )
//	because it return true for e4 already added to bucket --> contains method return true
//	element passed to contains method alread presert in set
}
