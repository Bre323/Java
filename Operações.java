import java.util.Scanner;

public class Opera��es {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int a, b, c, op;
		
		System.out.println("Digite um n�mero");
		a = scan.nextInt();
		System.out.println("Digite um segundo n�mero");
		b = scan.nextInt();
		System.out.println("1 - Soma");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
		System.out.print("Selecione uma das op��es: ");
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
