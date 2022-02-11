package supabstract;

public class Animal {
	
	String cor;
	int patas;
	boolean cauda;
	
	Animal(String cor, int patas, boolean cauda) {
		this.cor = cor;
		this.patas = patas;
		this.cauda = cauda;
	}
	
	public String toString() {
		return "Cor: "+this.cor+"\nPatas: "+this.patas+"\ncauda: "+this.cauda;
	}
}
