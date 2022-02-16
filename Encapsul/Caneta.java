package Encapsul;

public class Caneta {

	private String modelo;
	private String cor;
	private float ponta;
	
	Caneta(String modelo, String cor, float ponta) {
		this.setModelo(modelo);
		this.setCor(cor);
		this.setPonta(ponta);
	}
	
	
	//GETTERS
	public String getModelo() {
		return this.modelo;
	}
	public String getCor() {
		return this.cor;
	}
	public float getPonta() {
		return this.ponta;
	}
	
	
	//SETTERS
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
}
