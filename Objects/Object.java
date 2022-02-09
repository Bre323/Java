package programJar.Objects;

// Objeto: É uma instância de uma classe constituido de atributos e métodos.

public class Object {
	
	public static void main(String[] args) {
		Guitar oldGuitar = new Guitar();
		
		System.out.println(oldGuitar.brand);
		System.out.println(oldGuitar.model);
		System.out.println(oldGuitar.color);
		System.out.println(oldGuitar.strings);
		System.out.println(oldGuitar.price);
		System.out.println(oldGuitar.tuned);
		System.out.println();
		
		oldGuitar.tuning();
		oldGuitar.play();
		
		
		/*
		Guitar newGuitar = new Guitar();
		newGuitar.brand = "Gibson";
		newGuitar.model = "SG";
		newGuitar.color = "Blue";
		newGuitar.strings = 8;
		*/
	}
}
