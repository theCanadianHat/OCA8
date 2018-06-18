package njh.c5.inheritance.impl;

import njh.c5.inheritance.api.HasInfo;
/*
	Inheritance in Java is the process in which
	a child subclass automatically gets all public 
	and protected primitives, objects, or methods.

	Java supports single inheritance.

	All classes extend java.lang.Object
*/
public class UsingInheritance {
	public static void main(String[] args) {
		Animal animal = new Animal("Dog");
		System.out.println(animal.getName());	//Dog

		Mammal mammal = new Mammal();
		System.out.println(mammal.getName());	//UnnamedAnimal
		System.out.println(mammal.numOfLegs);	//0

		Bear bear = new Bear();
		System.out.println(bear.getInfo());		//This is a Bear. Named: Unnamed Animal, Colored: Poop.

		Reptile reptile = new Reptile("Alligator");
		System.out.println(reptile.getInfo());	//This is a Reptile. Named: Alligator.
	}
}

//parent class
class Animal {
	private String name;
	protected int numOfLegs;

	public Animal(){
		this.name = "Unnamed Animal";
		this.numOfLegs = 0;
	}

	public Animal(String name){
		this.name = name;
		this.numOfLegs = 0;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}
}

/*
	Must use the extends keyword to create a 
	subclass.

*/
//children classes
class Mammal extends Animal {
	/*
	This is an empty class. It extends Animal
	so it gets all the private and protected
	members for free!

	The compiler will add the default constructor.
	The compiler will also add a call to Animal's 
	default (no argument) constructor inside Mammal's
	constructor.
	*/
}

class Reptile extends Animal implements HasInfo{
	public Reptile(String name){
		super(name);
	}

	public String getInfo(){
		return "This is a Reptile. Named: " + getName() + ".";
	}
}

class Fish extends Animal {}

class Bear extends Mammal implements HasInfo{
	private String color;

	//The compiler adds a call to super() (Mammal()) as the first line
	public Bear() {
		//super();
		this.color = "Poop";
	}

	public String getInfo(){
		return "This is a Bear. Named: " + getName() + ", Colored: " + color + ".";
	}
}