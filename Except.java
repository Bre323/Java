package programJar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except {

	public static void main(String[] args) {
		
		double x, y, z;
		Scanner scanner = new Scanner(System.in);
		
		//Exce��o: � um evento n�o esperado que ocorre no sistema durante o tempo de execu��o
		//		   Quando o sistema captura alguma exce��o o fluxo do c�digo � imterrompido
		
		try {
			System.out.print("Digite o n�mero para ser o Dividendo: ");
			x = scanner.nextInt();
			System.out.print("Digite o n�mero para ser o Divisor: ");
			y = scanner.nextInt();
			
			z = x / y;
			
			System.out.println(x +" dividido por "+ y + " � igual a " + z);
		}
		catch (InputMismatchException ime) {
			System.out.println("ERRO. Apenas n�meros s�o aceitos");
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
