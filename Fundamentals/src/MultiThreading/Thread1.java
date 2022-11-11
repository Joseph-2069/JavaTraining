package MultiThreading;

public class Thread1 implements Runnable{

	public void run() {
		for(int i =0;i<50;i++) {
			System.out.println(Thread.currentThread().getName()+" i "+i);
		}
		
		try {
			Thread.sleep(3000);// not needed in the actual program it is used when we need some time between the process execution
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
