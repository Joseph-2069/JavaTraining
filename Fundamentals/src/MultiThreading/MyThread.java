package MultiThreading;
//import statement
import java.io.*;
// Java program *******to understand the joining of threads****
public class MyThread extends Thread{
	//overriding the run method
	
	public void run() {
		System.out.println("MyThread started....");
		for(int j=0 ;j<10;j++) {
			try {
				//sleeping the thread for 300 miliseconds
				Thread.sleep(300);
				System.out.println("The current thread name is "+Thread.currentThread().getName());
			}
			
			//Catch exception
			catch(Exception e) {
				System.out.println("The exception has been caught"+e);
			}
			System.out.println(j);
		}
		System.out.println("MyThread run method completed....");
		//end of run method
	}//end of thread class

}
