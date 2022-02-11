package supabstract;

public class Dog extends Animal {
	
	String nome;
	int idade;
	
	Dog(String nome, int idade, String cor, int patas, boolean cauda) {
		super(cor, patas, cauda);
		this.nome = nome;
		this.idade = idade;
	}
	
	public String toString() {
		return "Nome: "+this.nome+"\nIdade: "+this.idade+"\n"+super.toString()+"\n";
	}
}
