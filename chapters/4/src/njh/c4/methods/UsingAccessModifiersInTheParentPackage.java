package njh.c4.methods;

//have to import AccessModifiers because we are no longer
//in the same package
import njh.c4.methods.accessModifiers.AccessModifiers;

/*
	Since we are no longer in the same package as AccessModifiers
	we lose almost all access to its members. We only have access
	to public members from here.
*/

public class UsingAccessModifiersInTheParentPackage {
	public static void main(String[] args){
		AccessModifiers am = new AccessModifiers(1, 2, 3, 4);
		System.out.println(am.a);
		//System.out.println(am.b); //won't compile
		//System.out.println(am.c); //won't compile
		//System.out.println(am.d); //won't compile
	}
}