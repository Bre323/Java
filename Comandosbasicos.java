import java.util.Scanner;

public class Comandosbasicos {

	public static void main(String[] args) {
		
		int x = 2; 							//Declarando um número inteiro
		float f = 3.14f;					//Declarando um número decimal
		double y = 1.52; 					//Declarando um número decimal (maior precisão)
		boolean b = true; 					//Declarando um valor booleano
		char c = 'a'; 						//Declarando caracteres
		long nl = 124897989089128412L;		//Declarando uma variável de valor muito alto
		String name = "str"; 				//Declarando uma string
		
		
		System.out.println("\\Hello World!\n");
		System.out.println("\t\"Java is good!\"\n");
		System.out.println("Número x = " + x);
		System.out.println("Número float = " + f);
		System.out.println("String name = " + name);
		System.out.println("nl é um número muito alto >>> nl = " + nl);
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o seu nome? ");
		String nome = scanner.nextLine();
		System.out.println("Qual a sua idade? ");
		int idade = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Playstation ou Xbox? ");
		String vg = scanner.nextLine();
		
		
		System.out.println("Olá, " + nome);
		System.out.println("Você tem " + idade + " anos");
		System.out.println("Você curte jogar no " + vg);
		
		
		//Comentários se fazem com "//" ou "/**/" para várias linhas
		
		
		/*OPERADORES
		 * "+" é usado para adição				"-" é usado para a subtração
		 * "*" é usado para a multiplicação		"/" é usado para a divisão
		 * 
		 * 
		 * "%" mostra o resto de uma divisão inteira
		 * 
		 * 
		 * Em uma variável "X" também é possível fazer incrementos e decrementos
		 * Com "X++" (incremento) e "X--" (Decremento)
		 * 
		 */
	}

}
