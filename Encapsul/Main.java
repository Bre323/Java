package Encapsul;

public class Main {
	
	public static void main(String[] args) {
		
		// Encapsulamento: Os atributos de uma classe serão privados ou protegidos e serão acessados por meio de getters e setters.
		//				   Para proporcionar uma melhor segurança, Atributos devem ser privados caso não exista motivo para deixá-lo público.
		
		// Getter: Os Getters são métodos responsáveis pelo acesso dos atributos da classe que não estão disponibilizados normalmente.
		
		// Setter: Os Setters são métodos responsáveis pela modificação dos atributos da classe que não estão disponibilizados normalmente.
		
		Caneta caneta = new Caneta("BIC", "Azul", 0.5f);
		Caneta bic = new Caneta(caneta);
		
		System.out.println(caneta.toString());
		bic.setPonta(0);
		System.out.println(bic.toString());
		
		caneta.setModelo("Zic");
		caneta.setCor("Roxo");
		caneta.setPonta(0.7f);
		System.out.println(caneta.toString());
	}
}
