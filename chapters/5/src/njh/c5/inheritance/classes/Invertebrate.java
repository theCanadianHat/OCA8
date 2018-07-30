package njh.c5.inheritance.classes;

public class Invertebrate extends Animal{
	private boolean hasPrimitiveBrain;

	public Invertebrate(String name, String color, int age, boolean hasPrimitiveBrain){
		super(name, color, age);
		this.hasPrimitiveBrain = hasPrimitiveBrain;
	}

	public boolean getHasPrimitiveBrain(){
		return hasPrimitiveBrain;
	}

	public void setHasPrimitiveBrain(boolean hasPrimitiveBrain){
		this.hasPrimitiveBrain = hasPrimitiveBrain;
	}

	public void eats (String food){
		System.out.println("This Invertebrate eats " + food);
	}

	public static void main(String[] args) {
		Invertebrate invertebrate = new Invertebrate("Invertebrate1", "White", 10, true);
		invertebrate.eats("Things");
	}
}