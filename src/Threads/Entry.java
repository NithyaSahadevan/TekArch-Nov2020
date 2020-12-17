package Threads;

public class Entry {
	public static void main(String[] args) {
		/*
		 Thread
		 Multi thread
		 
		 * */
		ThreadExample oT1 = new ThreadExample("Sri 1");
		ThreadExample oT2 = new ThreadExample("Sri 2");
		oT1.start();
		oT2.start();
		
		//DeadLock
	}

}
