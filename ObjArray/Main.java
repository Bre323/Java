package programJar.ObjArray;

public class Main {

	public static void main(String[] args) {
		
		//Animals Farm[] = new Animals[3];
		
		Animals animal1 = new Animals("Pig", "White", 25);
		Animals animal2 = new Animals("Horse", "Blue", 300);
		Animals animal3 = new Animals("Chicken", "Black", 10);
		Animals Farm[] = {animal1, animal2, animal3};
		
		//Farm[0] = animal1;
		//Farm[1] = animal2;
		//Farm[2] = animal3;
		
		System.out.println(Farm[0].toString());
		System.out.println(Farm[1].toString());
		System.out.println(Farm[2].toString());
	}

}
