package njh.c5.inheritance.classes;

public class Bear extends Mammal{
	public Bear(String name, String color, int age){
		super(name, color, age, true, false);
	}

	public void eats(String food){
		System.out.println("This " + name + " eats " + food);
	}

	public static void main(String[] args) {
		Bear bear = new Bear("Grizzly", "Brown", 10);
		bear.eats("Berries");
	}
}