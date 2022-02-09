package programJar.Objects;

public class Guitar {
	
	String brand = "Fender";
	String model = "Stratocaster";
	String color = "Yellow";
	int strings = 6;
	double price = 599.99;
	boolean tuned = false;
	
	
	void tuning() {
		if(tuned == false) {
			System.out.println("Tuning guitar...");
			tuned = true;
		} else {
			System.out.println("Already tuned");
		}
	}
	
	void play() {
		System.out.println("Playing guitar!!");
	}
	
}
