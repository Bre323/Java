package programJar;

public class Method {
	
	public static void main(String[] args) {
		
		// Um método é um bloco de código que pode ser executado sempre que é chaamado.
		// Pode retornar valores ou receber um ou mais parâmetros.
		
		helloWorld("World!!");
		
		int sum = add(300, 60, 9);
		System.out.println(sum);
	}
	
	
	static void helloWorld(String str) {
		System.out.println("Hello "+ str);
	}
	
	
		//Também é possível fazer uma sobrecarga de função (Overloaded Method).
		//Dois ou mais métodos podem ter o mesmo nome, mas possuem parâmetros diferentes.
		//Sendo assim, suas assinaturas são levemente distintas.
	
		//Assinatura de método = nome + parâmetros;
	
	
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
	
		//Outras formas de fazer isso seria alterando a ordem dos parâmetros, ou declarar com tipos diferentes
	
		//EXEMPLOS
		//add(int, float) ------ add(float, int)
		//add(int, int)   ------ add(int, float)
}
