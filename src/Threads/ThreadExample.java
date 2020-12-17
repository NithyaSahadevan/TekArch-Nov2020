package Threads;

public class ThreadExample implements Runnable{
	
    Thread myThread;
	
	private String sName;
	public ThreadExample(String sName) {
	this.sName = sName;
	}

	@Override
	public void run() {
		// We can do the task here
		for(int i=0;i<5; i++)
		{
			System.out.println("Name = "+sName+ "\t count = "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void start(){
		System.out.println("Thread Started");
		if(myThread == null) {
			myThread = new Thread(sName);
			System.out.println("0000");
			myThread.start();
		}
		System.out.println("Thread Ended");
	}
}
