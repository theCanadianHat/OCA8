package njh.c5.inheritance.classes;

public class JellyFish extends Invertebrate{
	public JellyFish(String name, String color, int age){
		super(name, color, age, true, true);
	}

	public void eats(String food){
		System.out.println("This " + name + " eats " + food);
	}

	public static void main(String[] args) {
		JellyFish jellyFish = new JellyFish("Squishy", "Purple", 18);
		jellyFish.eats("Stuff");
	}
}