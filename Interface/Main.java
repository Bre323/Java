package Interface;

public class Main {

	public static void main(String[] args) {
		
		
		// Interface: É um recurso utilizado para 'impor' a um determinado grupo de classes a ter métodos ou propriedades.
		//			  Os métodos definidos em uma interface devem ser definidos dentro da classe que implementa a interface.
		//			  Cada classe pode implementar os métodos de uma interface de uma maneira diferente.
		//			  É uma alternativa para a herança múltipla, que não existe em java.
		
		
		Apple apple = new Apple();
		Pineapple pineapple = new Pineapple();

		apple.collect();
		apple.eat();
		pineapple.collect();
		pineapple.eat();
		
	}
}
