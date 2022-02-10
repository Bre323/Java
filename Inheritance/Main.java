package Inheritance;

public class Main {

	public static void main(String[] args) {
		
		//Com o comando 'extends' � poss�vel herdar os atributos e m�todos de uma classe para a sub-classe.
		//EXEMPLO
		//public class Car extends Vehicle
		//public class Bicycle extends Vehicle
		
		//Ao definir um m�todo de mesmo nome em 'Car' e 'Vehicle'
		//O m�todo definido na sub-classe sobrep�e o m�todo herddado.
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		
		System.out.println(car.wheels);
		System.out.println(car.doors);
		car.move();
		
		System.out.println(bicycle.wheels);
		System.out.println(bicycle.pedals);
		bicycle.move();

	}

}
