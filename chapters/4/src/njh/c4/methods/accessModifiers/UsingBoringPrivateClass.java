package njh.c4.methods.accessModifiers;

/*
	Since we are no longer in BoringPrivateClass we can not access is
	private members. Like I said, BoringPrivateClass is pretty boring.

	Uncommenting the code below will result in a compilation error.
	---------------------------------------------------------------
	njh/example/methods/accessModifiers/BrokenPrivateClass.java:22: error: name has private access in BoringPrivateClass
			System.out.println(pc.name);	//Will not compile
			                     ^
	njh/example/methods/accessModifiers/BrokenPrivateClass.java:23: error: age has private access in BoringPrivateClass
			System.out.println(pc.age); 	//Will not compile
			                     ^
	2 errors
*/

public class UsingBoringPrivateClass {
	
	public static void main(String[] args){
		BoringPrivateClass pc = new BoringPrivateClass("Private", 13);
		/*
		System.out.println(pc.name);	//Will not compile
		System.out.println(pc.age); 	//Will not compile
		/**/
	}
}