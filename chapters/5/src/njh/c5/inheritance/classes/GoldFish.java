package njh.c5.inheritance.classes;

public class GoldFish extends Fish{
	public GoldFish(String name, String color, int age){
		super(name, color, age, true, true);
	}

	public void eats(String food){
		System.out.println("This " + name + " eats " + food);
	}

	public static void main(String[] args) {
		GoldFish goldFish = new GoldFish("Goldie", "Orange", 1);
		goldFish.eats("Pellets");
	}
}