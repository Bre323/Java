package Encapsul;

public class Main {
	
	public static void main(String[] args) {
		
		// Encapsulamento: Os atributos de uma classe ser�o privados ou protegidos e ser�o acessados por meio de getters e setters.
		//				   Para proporcionar uma melhor seguran�a, Atributos devem ser privados caso n�o exista motivo para deix�-lo p�blico.
		
		// Getter: Os Getters s�o m�todos respons�veis pelo acesso dos atributos da classe que n�o est�o disponibilizados normalmente.
		
		// Setter: Os Setters s�o m�todos respons�veis pela modifica��o dos atributos da classe que n�o est�o disponibilizados normalmente.
		
		Caneta caneta = new Caneta("BIC", "Azul", 0.5f);
		System.out.println(caneta.getModelo());
		System.out.println(caneta.getCor());
		System.out.println(caneta.getPonta());
		caneta.setModelo("Zic");
		caneta.setCor("Roxo");
		caneta.setPonta(0.7f);
		System.out.println(caneta.getModelo());
		System.out.println(caneta.getCor());
		System.out.println(caneta.getPonta());
	}

}
