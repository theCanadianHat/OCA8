package njh.c5.inheritance.classes;

public class Lizard extends Reptile{
	public Lizard(String name, String color, int age){
		super(name, color, age, true, false);
	}

	public void eats(String food){
		System.out.println("This " + name + " eats " + food);
	}

	public static void main(String[] args) {
		Lizard lizard = new Lizard("Blue Skink", "Blue/Black", 4);
		lizard.eats("Gnats");
	}
}