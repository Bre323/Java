package Polymorph;

public class Boat extends Vehicle {

	@Override
	public void go() {
		this.moving = true;
		System.out.println("Boat moving...");
	}
	
	@Override
	public void stop() {
		this.moving = false;
		System.out.println("Boat stoping...");
	}
}
