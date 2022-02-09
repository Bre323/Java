package programJar.Constructors;

public class Dog {
	
	String nome;
	String ra�a;
	int peso;
	int idade;
	
	
	// Construtores s�o chamados assim que um novo objeto � criado
	// Construtores s�o respons�veis pela aloca��o de recursos que s�o necess�rios para o funcionamento do objeto
	// E tambem s�o respons�veis pela defini��o inicial de vari�veis do objeto criado
	
	
	Dog(String nome) {
		this.nome = nome;
	}
	
	Dog(String nome, String ra�a) {
		this.nome = nome;
		this.ra�a = ra�a;
	}
	
	Dog(String nome, String ra�a, int peso) {
		this.nome = nome;
		this.ra�a = ra�a;
		this.peso = peso;
	}
	
	Dog(String nome, String ra�a, int peso, int idade) {
		
		this.nome = nome;
		this.ra�a = ra�a;
		this.peso = peso;
		this.idade = idade;
	}
	
	
	// A sobrecarga de elementos construtores tamb�m � poss�vel de ser feito
	// Ela � feita da mesma forma de que a sobrecarga de fun��o, com v�rias vers�es de um construtor de mesmo nome
	
	
	void bark() {
		System.out.println(this.nome+" said: woof woof!!!");
	}
}
