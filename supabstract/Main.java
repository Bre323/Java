package supabstract;

public class Main {
	
	// Super: Faz referência ao construtor da classe mãe do objeto.
	// 		  Funciona de uma forma semelhante ao 'this'.
	
	// Abstract: A classe que é declarada como 'abstract' não pode ser instanciada por um objeto, mas pode ter subclasse.
	//			 Os Atributos e métodos só podem ser acessados por uma subclasse, por meio de herança.
	//			 Os métodos declarados dentro de uma classe 'abstract' não possuem um corpo.
	//			 A implementação dos métodos que são declarados em uma classe 'abstract' devem ser definidas pela subclasse.
	//			 Abstract pode ser declarada para classes e métodos.
	
	
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
