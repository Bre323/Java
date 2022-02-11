package supabstract;

public class Car extends Vehicle{
	
	@Override
	void go() {
		System.out.println("moving...");
	}
	
	@Override
	void stop() {
		System.out.println("The car stopped");
	}
	
}
