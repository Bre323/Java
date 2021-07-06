import java.util.Scanner;

public class voto {

	public static void main(String[] args) {
		
		int age = 18; 
		Scanner vot = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		age = vot.nextInt();
		vot.close();
		
		if (age <= 16) {
			System.out.println("Não vota");
		}
		if (16 < age && age < 18 || age > 70) {
			System.out.println("Voto opcional");
		}
		if (age >= 18 && age <= 70) {
			System.out.println("Voto Obrigatório");
		}
	}

}
