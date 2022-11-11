package MultiThreading;
import java.io.*;

//Java program to understand the joining of the threads

public class MuktiThreadingUnderstanding {
	//main method
	public static void main(String[]args) {
		
		
		System.out.println("Main Thread started executing .... ");
		//creating 3 threads 
		Thread th1 = new MyThread();
		th1.start();
		
		//starting the second thread after when 
		// the first thread th1 has ended or died
		try {
			System.out.println("The current thread name is "+ Thread.currentThread().getName());
			//invoking the join() method
			
			th1.join();//here its blocking call and main thread will be blocked / wait till th1 thread completes
		}
		//catch block for catching the raised exception 
		catch(Exception e) {
			System.out.println("The exception has been caught "+e);
		}
		
		System.out.println("Main Thread joined at the end of MyThread an now it continued its processing ahead ... ");
	}
}
