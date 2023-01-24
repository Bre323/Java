package Threads;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Thread.currentThread().setName("MAIN");
		Thread.currentThread().setPriority(10);
		
		for(int i = 3; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		System.out.println("\nActive Threads: " + Thread.activeCount());
		System.out.println("Current thread name: " + Thread.currentThread().getName());
		System.out.println("Current thread priority: " + Thread.currentThread().getPriority());
		System.out.println("isAlive = " + Thread.currentThread().isAlive());
		
	}

}
