package njh.c1.variables.references.classStructure.constructors;

/*
	Constructors are how you create new instances
	of objects. They have no return type, and are
	the same name as the class.
*/
public class UsingConstructors {
	String name;

	//no return type
	//void UsingCunstructors() {} not a constructor
	//same name as the class
	UsingConstructors(){
		name = "Bob";
	}

	UsingConstructors(String name){
		this.name = name;
	}

	public static void main(String[] args) {
		//Constructors are used with the new keyword
		UsingConstructors uc1 = new UsingConstructors();
		System.out.println(uc1.name); //Bob
		//Passing in what I want name to be
		UsingConstructors uc2 = new UsingConstructors("Kate");
		System.out.println(uc2.name); //Kate
	}
}