package njh.c5.inheritance.classes;

public class Bird extends Animal{
	private boolean hasFeathers;

	public Bird(String name, String color, int age, boolean hasFeathers){
		super(name, color, age);
		this.hasFeathers = hasFeathers;
	}

	public boolean getHasFeathers(){
		return hasFeathers;
	}

	public void setHasFeathers(boolean hasFeathers){
		this.hasFeathers = hasFeathers;
	}

	public void eats (String food){
		System.out.println("This Bird eats " + food);
	}

	public static void main(String[] args) {
		Bird bird = new Bird("Bird1", "Green", 2, true);
		bird.eats("Seeds");
	}
}