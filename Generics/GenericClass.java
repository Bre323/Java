package Generics;

public class GenericClass <T extends Number> {

	T x;
	
	GenericClass(T x) {
		this.x = x;
	}
	
	public T getValue() {
		return x;
	}
}
