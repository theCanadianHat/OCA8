package njh.c5.inheritance.classes;

public class Amphibian extends Animal{
	private boolean hasGills;
	private boolean hasLungs;
	private boolean breathesThroughSkin;

	public Amphibian(String name, String color, int age, boolean hasGills, boolean hasLungs, boolean breathesThroughSkin){
		super(name, color, age);
		this.hasGills = hasGills;
		this.hasLungs = hasLungs;
		this.breathesThroughSkin = breathesThroughSkin;
	}

	public boolean getHasGills(){
		return hasGills;
	}

	public void setHasGills(boolean hasGills){
		this.hasGills = hasGills;
	}

	public boolean getHasLungs(){
		return hasLungs;
	}

	public void setHasLungs(boolean hasLungs){
		this.hasLungs = hasLungs;
	}

	public boolean getBreathesThroughSkin(){
		return breathesThroughSkin;
	}

	public void setBreathesThroughSkin(boolean breathesThroughSkin){
		this.breathesThroughSkin = breathesThroughSkin;
	}

	public void eats (String food){
		System.out.println("This Amphibian eats " + food);
	}

	public static void main(String[] args) {
		Amphibian amphibian = new Amphibian("Amphibian1", "Yellow", 6, true, false, false);
		amphibian.eats("Plankton");
	}
}