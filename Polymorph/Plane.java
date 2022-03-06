package Polymorph;

public class Plane extends Vehicle {
	
	@Override
	public void go() {
		this.moving = true;
		System.out.println("Plane moving...");
	}
	
	@Override
	public void stop() {
		this.moving = false;
		System.out.println("Plane stoping...");
	}
}
