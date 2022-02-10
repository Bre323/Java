package Inheritance;

public class Main {

	public static void main(String[] args) {
		
		//Com o comando 'extends' é possível herdar os atributos e métodos de uma classe para a sub-classe.
		//EXEMPLO
		//public class Car extends Vehicle
		//public class Bicycle extends Vehicle
		
		//Ao definir um método de mesmo nome em 'Car' e 'Vehicle'
		//O método definido na sub-classe sobrepõe o método herddado.
		
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
