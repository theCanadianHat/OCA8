package njh.c5.inheritance.classes;

public class Robin extends Bird{
	public Robin(String name, String color, int age){
		super(name, color, age, true);
	}

	public void eats(String food){
		System.out.println("This " + name + " eats " + food);
	}

	public static void main(String[] args) {
		Robin robin = new Robin("Robin", "Orange", 3);
		robin.eats("Seeds");
	}
}