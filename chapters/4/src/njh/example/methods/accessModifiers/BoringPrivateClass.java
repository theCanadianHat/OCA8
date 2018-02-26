package njh.example.methods.accessModifiers;

/*
	This class is boring but is here to make a point.
	This class have two fields, both private.
	Only code in this class can access private methods and fields
	defined in this class.
*/

public class BoringPrivateClass{
	private String name;
	private int age;

	BoringPrivateClass(String name, int age){
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args){
		BoringPrivateClass pc = new BoringPrivateClass("Private", 13);
		//This is legal because we are still in BoringPrivateClass
		System.out.println(pc.name);
		System.out.println(pc.age);
	}
}