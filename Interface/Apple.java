package Interface;

public class Apple implements Fruit{
	
	@Override
	public void collect() {
		System.out.println("Collecting apples for lunch...");
	}
	
	@Override
	public void eat() {
		System.out.println("Eating apple...");
	}

}
