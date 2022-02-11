package supabstract;

public class Main {
	
	// Super: Faz refer�ncia ao construtor da classe m�e do objeto.
	// 		  Funciona de uma forma semelhante ao 'this'.
	
	// Abstract: A classe que � declarada como 'abstract' n�o pode ser instanciada por um objeto, mas pode ter subclasse.
	//			 Os Atributos e m�todos s� podem ser acessados por uma subclasse, por meio de heran�a.
	//			 Os m�todos declarados dentro de uma classe 'abstract' n�o possuem um corpo.
	//			 A implementa��o dos m�todos que s�o declarados em uma classe 'abstract' devem ser definidas pela subclasse.
	//			 Abstract pode ser declarada para classes e m�todos.
	
	
	public static void main(String[] args) {
		
		Dog dog = new Dog("dog", 13, "Branco", 4, true);
		Dog dog2 = new Dog("jojo", 1, "Azul", 4, false);
		
		Car car = new Car();
		Car car2 = new Car();
		
		System.out.println(dog.toString()+"\n"+dog2.toString());
		car.go();
		car2.go();
		car2.stop();
	}
}
