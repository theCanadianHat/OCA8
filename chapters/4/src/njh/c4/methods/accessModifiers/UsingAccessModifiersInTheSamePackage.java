package njh.c4.methods.accessModifiers;

/*
	Since we are in the same package as AccessModifiers we can access
	its protected and default access members. We still of course can
	access their public members, and can't access their private memebers.
*/

public class UsingAccessModifiersInTheSamePackage {
	public static void main(String[] args){
		AccessModifiers am = new AccessModifiers(1, 2, 3, 4);
		System.out.println(am.a);
		System.out.println(am.b);
		System.out.println(am.c);
		//System.out.println(am.d); //won't compile
	}
}