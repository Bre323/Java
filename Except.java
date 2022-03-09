package programJar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except {

	public static void main(String[] args) {
		
		double x, y, z;
		Scanner scanner = new Scanner(System.in);
		
		//Exceção: É um evento não esperado que ocorre no sistema durante o tempo de execução
		//		   Quando o sistema captura alguma exceção o fluxo do código é imterrompido
		
		try {
			System.out.print("Digite o número para ser o Dividendo: ");
			x = scanner.nextInt();
			System.out.print("Digite o número para ser o Divisor: ");
			y = scanner.nextInt();
			
			z = x / y;
			
			System.out.println(x +" dividido por "+ y + " é igual a " + z);
		}
		catch (InputMismatchException ime) {
			System.out.println("ERRO. Apenas números são aceitos");
		}
		catch (Exception e) {
			System.out.println("ERRO. ALGO DEU ERRADO");
		}
		finally {
			scanner.close();
			System.out.println("FIM DO PROGRAMA");
		}
	}
}
