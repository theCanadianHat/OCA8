package njh.c4.methods.accessModifiers;

/*
	This class will be used by others to show how Java's
	access modifiers work.
*/

public class AccessModifiers {
	public int a;
	int b;
	protected int c;
	private int d;

	public AccessModifiers(int a, int b, int c, int d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	/*
		Like in PrivateClass, this main is inside the class AccessModifiers.
		So it can access all levels of AccessModifiers memebers directly.
	*/
	public static void main(String[] args){
		AccessModifiers am = new AccessModifiers(1, 2, 3, 4);
		System.out.println(am.a);
		System.out.println(am.b);
		System.out.println(am.c);
		System.out.println(am.d);
	}
}