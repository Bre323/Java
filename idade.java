package if_statement;
import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		
		int age;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		age = scanner.nextInt();
		scanner.close();
		
		if (age < 13) {
			System.out.println("Voce � uma crian�a");
		}
		else if (age >= 13 && age < 18) {
			System.out.println("Voce � um adolescente");
		}
		else if (age >= 18 && age <= 60) {
			System.out.println("Voce � um adulto");
		}
		else if (age > 60) {
			System.out.println("Voce � um idoso");
		}
		else {
			System.out.println("ERROR");
		}
		
	}
}
