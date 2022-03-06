package Polymorph;

public class Bike extends Vehicle {

	@Override
	public void go() {
		this.moving = true;
		System.out.println("Bike moving...");
	}
	
	@Override
	public void stop() {
		this.moving = false;
		System.out.println("Bike stoping...");
	}
}
