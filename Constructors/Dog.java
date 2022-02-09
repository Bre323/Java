package programJar.Constructors;

public class Dog {
	
	String nome;
	String raça;
	int peso;
	int idade;
	
	
	// Construtores são chamados assim que um novo objeto é criado
	// Construtores são responsáveis pela alocação de recursos que são necessários para o funcionamento do objeto
	// E tambem são responsáveis pela definição inicial de variáveis do objeto criado
	
	
	Dog(String nome) {
		this.nome = nome;
	}
	
	Dog(String nome, String raça) {
		this.nome = nome;
		this.raça = raça;
	}
	
	Dog(String nome, String raça, int peso) {
		this.nome = nome;
		this.raça = raça;
		this.peso = peso;
	}
	
	Dog(String nome, String raça, int peso, int idade) {
		
		this.nome = nome;
		this.raça = raça;
		this.peso = peso;
		this.idade = idade;
	}
	
	
	// A sobrecarga de elementos construtores também é possível de ser feito
	// Ela é feita da mesma forma de que a sobrecarga de função, com várias versões de um construtor de mesmo nome
	
	
	void bark() {
		System.out.println(this.nome+" said: woof woof!!!");
	}
}
