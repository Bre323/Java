package Polymorph;

public class Main {

	public static void main(String[] args) {
		
		// Polymorfismo: É a habilidade que um objeto possui de se identificar com um ou mais tipos.
		//				 Um método de mesmo nome também pode ter vários comportamentos diferentes.
		
		Car car = new Car();
		Plane plane = new Plane();
		Boat boat = new Boat();
		Bike bike = new Bike();
		
		//Car Pilot[] = {car, plane, boat, bike}; 		//Apenas 'car' pode ser incluído na lista
		//Plane Pilot[] = {car, plane, boat, bike};		//Apenas 'plane' pode ser incluído na lista
		//Boat Pilot[] = {car, plane, boat, bike};		//Apenas 'boat' pode ser incluído na lista
		//Bike Pilot[] = {car, plane, boat, bike};		//Apenas 'bike' pode ser incluído na lista
		
		Vehicle Pilot[] = {car, plane, boat, bike};

		
		///GO
		Pilot[0].go();
		Pilot[1].go();
		Pilot[2].go();
		Pilot[3].go();
		
		System.out.println();
		
		//STOP
		Pilot[0].stop();
		Pilot[1].stop();
		Pilot[2].stop();
		Pilot[3].stop();

	}
}
