package Interface;

public class Main {

	public static void main(String[] args) {
		
		
		// Interface: � um recurso utilizado para 'impor' a um determinado grupo de classes a ter m�todos ou propriedades.
		//			  Os m�todos definidos em uma interface devem ser definidos dentro da classe que implementa a interface.
		//			  Cada classe pode implementar os m�todos de uma interface de uma maneira diferente.
		//			  � uma alternativa para a heran�a m�ltipla, que n�o existe em java.
		
		
		Apple apple = new Apple();
		Pineapple pineapple = new Pineapple();

		apple.collect();
		apple.eat();
		pineapple.collect();
		pineapple.eat();
		
	}
}
