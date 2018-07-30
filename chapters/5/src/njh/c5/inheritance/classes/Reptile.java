package njh.c5.inheritance.classes;

public class Reptile extends Animal{
	private boolean hasScales;
	private boolean hasShell;

	public Reptile(String name, String color, int age, boolean hasScales, boolean hasShell){
		super(name, color, age);
		this.hasScales = hasScales;
		this.hasShell = hasShell;
	}

	public boolean getHasScales(){
		return hasScales;
	}

	public void setHasScales(boolean hasScales){
		this.hasScales = hasScales;
	}

	public boolean getHasShell(){
		return hasShell;
	}

	public void setHasShell(boolean hasShell){
		this.hasShell = hasShell;
	}

	public void eats (String food){
		System.out.println("This Reptile eats " + food);
	}

	public static void main(String[] args) {
		Reptile reptile = new Reptile("Reptile1", "Dark Green", 10, true, false);
		reptile.eats("Bugs");
	}
}