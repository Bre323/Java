import java.util.Scanner;

public class Loops {
	
	public static void main (String[] args) {
		
	int[] nums = {1, 2, 3, 4, 5};
	int i, x, op;
	i = x = op = 0;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Escolha um dos loops: ");
	System.out.println("1. While loop");
	System.out.println("2. For loop");
	System.out.println("3. Do While loop");
	System.out.println("4. For Each loop");
	op = scanner.nextInt();
	
	
	
	if (op == 1) {
	/*
	 * O 'While' executa infinitamente enquanto determinada condição for obedecida.
	 */
	
		while (i == 0) {
			System.out.println("printando infinitamente...");
			scanner.close();
		}
	
		}
	
	
	
	if (op == 2) {
		System.out.println("Quantas repetições voce deseja? ");
		x = scanner.nextInt();
		scanner.close();
	/*
	 * O comando 'For' executa uma determinada quantidade de vezes.
	 * 
	 * (i = 0; i < 10; i++)
	 * Com a variavel valendo 0, enquanto i for menor que 10, incremente o valor de i.
	 */
	
		for(i = 0; i < x; i++) {
			System.out.println("Printando "+x+" vezes");
		}
	
		}
	
	
	
	if (op == 3) {
		
		System.out.println("Digite 0 para executar ao infinito");
		System.out.println("Ou qualquer outro valor numérico para executar uma vez");
		i = scanner.nextInt();
		scanner.close();
		
	/*
	 * Executa infinitamente, assim como o while, porém a primeira vez é executado
	 * de qualquer maneira.
	 */
	
		do {
			System.out.println("EXECUTANDO...");
		} while (i == 0);

	}
	
	
	
	if (op == 4) {
		System.out.println("Precorrendo a variável 'nums'");
		
	/*
	 * For each loop percorre todos os elementos de uma array/coleção de dados.
	 */	
		
		for (int j : nums) {
			System.out.println(j);
		}
	}
	
	
	
	/*
	 * While: Executa infinitamente, caso contrário não executa.
	 * 
	 * For: Executa um determinado número de vezes.
	 * 
	 * Do While: Executa infinitamente, caso contrário executa apenas uma vez.
	 * 
	 * For Each: Executa o loop percorrendo os elementos de uma lista.
	 */
	
	}
}
