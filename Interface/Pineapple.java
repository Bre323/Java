package Interface;

public class Pineapple implements Fruit{
	
	@Override
	public void collect() {
		System.out.println("Collecting pineapples...");
	}
	
	@Override
	public void eat() {
		System.out.println("Eating pineapple...");
	}

}
