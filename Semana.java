import java.util.Scanner;

public class Semana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1 - Domingo");
		System.out.println("2 - Segunda");
		System.out.println("3 - Terça");
		System.out.println("4 - Quarta");
		System.out.println("5 - Quinta");
		System.out.println("6 - Sexta");
		System.out.println("7 - Sábado");
		System.out.print("Escolha uma opção: ");
		int dia = scan.nextInt();
		scan.close();
		
		switch(dia) {
		
		case 1:
			System.out.println("Hoje é Domingo!!");
			break;
		case 2:
			System.out.println("Hoje é Segunda!!");
			break;
		case 3:
			System.out.println("Hoje é Terça!!");
			break;
		case 4:
			System.out.println("Hoje é Quarta!!");
			break;
		case 5:
			System.out.println("Hoje é Quinta!!");
			break;
		case 6:
			System.out.println("Hoje é Sexta!!");
			break;
		case 7:
			System.out.println("Hoje é Sábado!!");
			break;
		default:
			System.out.println("Esse dia não existe");		
		}
	}

}
