package programJar;

public class Wrapper {

	public static void main(String[] args) {
		/*
		 * Wrapper Class (Classe Empacotadora): É uma classe que fornece métodos de um objeto para um dado primitivo
		 * Dados Primitivos = (int, char, boolean, float, long, byte, short, double)
		*/
		
		//PRIMITIVO		//WRAPPER
		//-----------------------
		//byte			//Byte
		//short			//Short
		//int			//Integer
		//long			//Long
		//float			//Float
		//double		//Double
		//char			//Character
		//boolean		//Boolean
		
		Boolean a = true;
		Character b = 'a';
		Integer c = 1;
		Double d = 1.55;
		String name = "JoJo";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(name);
		
	}

}
