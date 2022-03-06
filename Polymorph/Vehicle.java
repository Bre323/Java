package Polymorph;

public class Vehicle {
	
	protected boolean moving;

	public void go() {
		this.moving = true;
		System.out.println("moving...");
	}
	
	public void stop() {
		this.moving = false;
		System.out.println("stoping...");
	}
}
