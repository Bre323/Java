package Generics;

public class Main {

	public static void main(String[] args) {
		
		GenericClass<Integer> myInt = new GenericClass<>(0);
		GenericClass<Double> myDouble = new GenericClass<>(2.15);
		//GenericClass<Character> myChar = new GenericClass<>('#');
		//GenericClass<String> myString = new GenericClass<>("String");
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		//System.out.println(myChar.getValue());
		//System.out.println(myString.getValue());
		
		/* 
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
		Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
		String[] stringArray = {"H", "E", "L", "L", "O"};
		
		displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
		displayArray(stringArray);
		
		System.out.println(getFirstElement(intArray));
		System.out.println(getFirstElement(doubleArray));
		System.out.println(getFirstElement(charArray));
		System.out.println(getFirstElement(stringArray));
		*/
	}
	
	public static <T> void displayArray(T[] array) {
		
		for(T x : array) {
			System.out.print(x + " ");
		}
		
		System.out.println();	
	}
	
	public static <T> T getFirstElement(T[] array) {
		
		return array[0];
	}
	
}
