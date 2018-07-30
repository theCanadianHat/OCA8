package njh.c5.inheritance.classes;

public class Fish extends Animal{
	private boolean hasScales;
	private boolean hasGills;

	public Fish(String name, String color, int age, boolean hasScales, boolean hasGills){
		super(name, color, age);
		this.hasScales = hasScales;
		this.hasGills = hasGills;
	}

	public boolean getHasScales(){
		return hasScales;
	}

	public void setHasScales(boolean hasScales){
		this.hasScales = hasScales;
	}

	public boolean getHasGills(){
		return hasGills;
	}

	public void setHasGills(boolean hasGills){
		this.hasGills = hasGills;
	}

	public void eats (String food){
		System.out.println("This Fish eats " + food);
	}

	public static void main(String[] args) {
		Fish fish = new Fish("Fish1", "Dark Blue", 10, true, true);
		fish.eats("Bugs");
	}
}