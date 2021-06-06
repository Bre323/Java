import java.util.Scanner;

public class Operações {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int a, b, c, op;
		
		System.out.println("Digite um número");
		a = scan.nextInt();
		System.out.println("Digite um segundo número");
		b = scan.nextInt();
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.print("Selecione uma das opções: ");
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
