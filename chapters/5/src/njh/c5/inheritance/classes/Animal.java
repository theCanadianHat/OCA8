package njh.c5.inheritance.classes;

/**
	This is the parent class
*/

public class Animal{
	private String name;
	private String color;
	private int age;

	protected boolean canSwim;
	protected boolean canRun;
	protected boolean canWalk;
	protected boolean canFly;
	protected int numberOfLegs;

	public Animal(String name, String color, int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public boolean getCanSwim(){
		return canSwim;
	}

	public void setCanSwim(boolean canSwim){
		this.canSwim = canSwim;
	}

	public void getCanRun(){
		return canRun;
	}

	public String setCanRun(boolean canRun){
		this.canRun = canRun;
	}

	public boolean getCanWalk(){
		return canWalk;
	}

	public void setCanWalk(boolean canWalk){
		this.canWalk = canWalk;
	}

	public boolean getCanFly(){
		return canFly;
	}

	public void setCanFly(boolean canFly){
		this.canFly = canFly;
	}

	public int getNumberOfLegs(){
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs){
		this.numberOfLegs = numberOfLegs;
	}

	public void eats (String food){
		System.out.println("This Animal eats " + food);
	}

	public static void main(String[] args) {
		Animal animal = new Animal("Animal1", "Black", 5);
		animal.eats("Grass");
	}
}