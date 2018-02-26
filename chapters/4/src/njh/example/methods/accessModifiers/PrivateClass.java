package njh.example.methods.accessModifiers;

/*
	This class is boring but is here to make a point.
	This class have two fields, both private.
	Only code in this class can access private methods and fields
	defined in this class.
*/

public class PrivateClass{
	private String name;
	private int age;

	PrivateClass(String name, int age){
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args){
		PrivateClass pc = new PrivateClass("Private", 13);
		//This is legal because we are still in PrivateClass
		System.out.println(pc.name);
		System.out.println(pc.age);
	}
}