import java.util.Scanner;

public class Semana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1 - Domingo");
		System.out.println("2 - Segunda");
		System.out.println("3 - Ter�a");
		System.out.println("4 - Quarta");
		System.out.println("5 - Quinta");
		System.out.println("6 - Sexta");
		System.out.println("7 - S�bado");
		System.out.print("Escolha uma op��o: ");
		int dia = scan.nextInt();
		scan.close();
		
		switch(dia) {
		
		case 1:
			System.out.println("Hoje � Domingo!!");
			break;
		case 2:
			System.out.println("Hoje � Segunda!!");
			break;
		case 3:
			System.out.println("Hoje � Ter�a!!");
			break;
		case 4:
			System.out.println("Hoje � Quarta!!");
			break;
		case 5:
			System.out.println("Hoje � Quinta!!");
			break;
		case 6:
			System.out.println("Hoje � Sexta!!");
			break;
		case 7:
			System.out.println("Hoje � S�bado!!");
			break;
		default:
			System.out.println("Esse dia n�o existe");		
		}
	}

}
