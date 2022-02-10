package programJar.ObjArray;

public class Animals {

	String animal;
	String color;
	double weight;
	
	Animals(String animal, String color, double weight) {
		this.animal = animal;
		this.color = color;
		this.weight = weight;
	}
	
	public String toString() {
		return this.color+" "+this.animal+" => "+this.weight+" kg";
	}
}
