import java.util.Scanner;

public class Comandosbasicos {

	public static void main(String[] args) {
		
		int x = 2; 							//Declarando um n�mero inteiro
		float f = 3.14f;					//Declarando um n�mero decimal
		double y = 1.52; 					//Declarando um n�mero decimal (maior precis�o)
		boolean b = true; 					//Declarando um valor booleano
		char c = 'a'; 						//Declarando caracteres
		long nl = 124897989089128412L;		//Declarando uma vari�vel de valor muito alto
		String name = "str"; 				//Declarando uma string
		
		
		System.out.println("\\Hello World!\n");
		System.out.println("\t\"Java is good!\"\n");
		System.out.println("N�mero x = " + x);
		System.out.println("N�mero float = " + f);
		System.out.println("String name = " + name);
		System.out.println("nl � um n�mero muito alto >>> nl = " + nl);
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o seu nome? ");
		String nome = scanner.nextLine();
		System.out.println("Qual a sua idade? ");
		int idade = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Playstation ou Xbox? ");
		String vg = scanner.nextLine();
		
		
		System.out.println("Ol�, " + nome);
		System.out.println("Voc� tem " + idade + " anos");
		System.out.println("Voc� curte jogar no " + vg);
		
		
		//Coment�rios se fazem com "//" ou "/**/" para v�rias linhas
		
		
		/*OPERADORES
		 * "+" � usado para adi��o				"-" � usado para a subtra��o
		 * "*" � usado para a multiplica��o		"/" � usado para a divis�o
		 * 
		 * 
		 * "%" mostra o resto de uma divis�o inteira
		 * 
		 * 
		 * Em uma vari�vel "X" tamb�m � poss�vel fazer incrementos e decrementos
		 * Com "X++" (incremento) e "X--" (Decremento)
		 * 
		 */
	}

}
