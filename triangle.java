package if_statement;
import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		
		int x, y, z;
		Scanner sides = new Scanner(System.in);
		
		System.out.println("x value: ");
		x = sides.nextInt();
		System.out.println("y value: ");
		y = sides.nextInt();
		System.out.println("z value: ");
		z = sides.nextInt();
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		System.out.println("Z = "+z);
		sides.close();
		
		if(x == y && y == z && z == x) {
			System.out.println("Triangulo Equilátero");
		}
		else if(x == y || y == z || z == x) {
			System.out.println("Triangulo Isósceles");
		}
		else if(x != y && y != z && z != x) {
			System.out.println("Triangulo Escaleno");
		}
		else {
			System.out.println("ERROR");
		}

	}
}
