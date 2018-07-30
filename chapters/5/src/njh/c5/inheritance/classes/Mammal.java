package njh.c5.inheritance.classes;

public class Mammal extends Animal{
	private boolean hasFur;
	private boolean laysEggs;

	public Mammal(String name, String color, int age, boolean hasFur, boolean laysEggs){
		super(name, color, age);
		this.hasFur = hasFur;
		this.laysEggs = laysEggs;
	}

	public boolean getHasFur(){
		return hasFur;
	}

	public void setHasFur(boolean hasFur){
		this.hasFur = hasFur;
	}

	public boolean getLaysEggs(){
		return laysEggs;
	}

	public void setLaysEggs(boolean laysEggs){
		this.laysEggs = laysEggs;
	}

	public void eats(String food){
		System.out.println("This Mammal eats " + food);
	}

	public static void main(String[] args) {
		Mammal mammal = new Mammal("Mammal1", "Brown", 10, true, false);
		mammal.eats("Meat");
	}
}