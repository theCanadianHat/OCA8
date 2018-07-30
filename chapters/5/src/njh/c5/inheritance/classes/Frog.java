package njh.c5.inheritance.classes;

public class Frog extends Amphibian{
	public Frog(String name, String color, int age){
		super(name, color, age, false, true, true);
	}

	public void eats(String food){
		System.out.println("This " + name + " eats " + food);
	}

	public static void main(String[] args) {
		Frog frog = new Frog("Kurmet", "Green", 30);
		frog.eats("Flies");
	}
}