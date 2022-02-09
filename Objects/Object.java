package programJar.Objects;

// Objeto: É uma instância de uma classe constituido de atributos e métodos.

public class Object {
	
	public static void main(String[] args) {
		Guitar oldGuitar = new Guitar();
		
		System.out.println(oldGuitar.toString());
		oldGuitar.tuning();
		oldGuitar.play();
		System.out.println("\n");
		
		
		Guitar newGuitar = new Guitar();
		newGuitar.brand = "Gibson";
		newGuitar.model = "SG";
		newGuitar.color = "Blue";
		newGuitar.strings = 8;
		System.out.println(newGuitar.toString());
	}
}
