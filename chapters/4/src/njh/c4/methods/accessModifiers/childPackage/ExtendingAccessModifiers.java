package njh.c4.methods.accessModifiers.childPackage;

import njh.c4.methods.accessModifiers.AccessModifiers;

/*
	So ExtendingAccessModifiers is a AccessModifiers. This means
	it can access AccessModifiers protected members. 
*/

public class ExtendingAccessModifiers extends AccessModifiers {
	public ExtendingAccessModifiers(int a, int b, int c, int d){
		super(a, b, c, d);
	}

	public static void main(String[] args){
		ExtendingAccessModifiers eam = new ExtendingAccessModifiers(1, 2, 3, 4);
		System.out.println(eam.a); //public 
		//System.out.println(eam.b); //won't compile - not in the same package
		System.out.println(eam.c); // protected - we are a subclass 
		//System.out.println(eam.d); //wont' compile - not in the class

		AccessModifiers am = new AccessModifiers(5, 6, 7, 8);
		System.out.println(am.a);
		//System.out.println(am.b); //won't compile - not in the same package
		//System.out.println(am.c); //won't compile - not in the same package, and AccessModifiers is not is own subclass
		//System.out.println(am.d); //wont' compile - not in the class
	}
}