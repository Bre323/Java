package programJar;

public class Arrays {

	public static void main(String[] args) {
		/*
			Arrays são utilizados para guardar vários valores dentro de uma única variável.
			As Arrays são declaradas com o seu valor entre colchetes ("[]").
		*/
		String[] food = {"Pizza", "Hot Dog", "Hamburguer"};
		
		
		String[] cars = new String[3]; //Array declarada com uma quantidade definida de elementos.
		cars[0] = "Camaro";
		cars[1] = "Porsche";
		cars[2] = "Tesla";
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println('\n');
		
		
		/*
	  		Arrays 2D são arrays que possuem o seu valor composto por outras Arrays.
		*/
		String[][] moreCars = {
								{"Camaro", "Tesla", "Porsche"},
								{"Uno", "Evoque", "Lamborghini"},
								{"Hilux", "Supra", "Ferrari"}
							  };
		
		for(int i2 = 0; i2 < moreCars.length; i2++) {
			System.out.println();
			for (int j = 0; j < moreCars[i2].length; j++) {
				System.out.print(moreCars[i2][j] + " ");
			}
			
		}
	}

}
