package programJar.Constructors;

public class Main {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Alex", "Bulldog", 14, 9);
		Dog dog2 = new Dog("Pit", "Pitbull");
		Dog dog3 = new Dog("Perl", "Pinscher", 8, 5);

		System.out.println(dog1.nome+" "+dog2.nome+" & "+dog3.nome);
		dog1.bark();
		dog2.bark();
		dog3.bark();
	}

}
