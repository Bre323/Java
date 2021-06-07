import java.util.Scanner;

public class Operaçőes {

	/*
	Operadores lógicos podem ser usados caso necessite conectar duas ou mais expressões
	
	3 tipos de operadores lógicos são usados:
		- "&&" (AND): As duas condições devem ser verdadeiras.
		- "||" (OR) : Uma das condições impostas deve ser verdadeiras.
		- "!"  (NOT): Reverte o valor booleano da condição.
	*/
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a, b, c, op;
		
		System.out.println("Digite um número");
		a = scan.nextInt();
		System.out.println("Digite um segundo número");
		b = scan.nextInt();
		System.out.println("1 - Soma");
		System.out.println("2 - Subtraçăo");
		System.out.println("3 - Multiplicaçăo");
		System.out.println("4 - Divisăo");
		System.out.print("Selecione uma das opçőes: ");
		op = scan.nextInt();
		
		switch(op) {
		case 1:
			c = a + b;
			System.out.println(a+" + "+b+" = "+c);
			break;
		case 2:
			c = a - b;
			System.out.println(a+" - "+b+" = "+c);
			break;
		case 3:
			c = a * b;
			System.out.println(a+" * "+b+" = "+c);
			break;
		case 4:
			c = a / b;
			System.out.println(a+" / "+b+" = "+c);
			break;
			
		}
		
	}

}
