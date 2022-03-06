package Polymorph;

public class Car extends Vehicle {

	@Override
	public void go() {
		this.moving = true;
		System.out.println("Car moving...");
	}
	
	@Override
	public void stop() {
		this.moving = false;
		System.out.println("Car stoping...");
	}
}
