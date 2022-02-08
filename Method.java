package programJar;

public class Method {
	
	public static void main(String[] args) {
		
		// Um m�todo � um bloco de c�digo que pode ser executado sempre que � chaamado.
		// Pode retornar valores ou receber um ou mais par�metros.
		
		helloWorld("World!!");
		
		int sum = add(300, 60, 9);
		System.out.println(sum);
	}
	
	
	static void helloWorld(String str) {
		System.out.println("Hello "+ str);
	}
	
	
		//Tamb�m � poss�vel fazer uma sobrecarga de fun��o (Overloaded Method).
		//Dois ou mais m�todos podem ter o mesmo nome, mas possuem par�metros diferentes.
		//Sendo assim, suas assinaturas s�o levemente distintas.
	
		//Assinatura de m�todo = nome + par�metros;
	
	
	static int add(int a, int b) {
		System.out.println("ADD #1");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("ADD #2");
		return a + b + c;
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("ADD #3");
		return a + b + c + d;
	}
	
	static int add(int a, int b, int c, int d, int e) {
		System.out.println("ADD #4");
		return a + b + c + d + e;
	}
	
		//Outras formas de fazer isso seria alterando a ordem dos par�metros, ou declarar com tipos diferentes
	
		//EXEMPLOS
		//add(int, float) ------ add(float, int)
		//add(int, int)   ------ add(int, float)
}
