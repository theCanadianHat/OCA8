package njh.c4.methods.overloading;

/*
	Overloading methods is all about the parameter list. The name
	of the method should be the same. Java does not care about the
	return types or the specifier is the parameter list is the same
	as another method already defined.
*/
public class MethodOverloading{
	public void run0(int x) {
		System.out.println("public void run0(int x)");
		System.out.println("x = " + x);		
	}
	/*
		These two methods below look the same to java as the one defined above
		The parameter lists and names are the same, the different return type and
		optional specifier is not enough to be able to determine which method to 
		call at run time.
	*/
	//public static void run0(int x) {} //does not compile doesn't care about static 
	//public int run0(int x) {} //does not compile even though return type is different
	public int run0(int x, short y) {
		System.out.println("public int run0(int x, short y)");
		System.out.println("x = " + x + ", y = " + y);		
		return 0;
	}
	public void run0(int x, int y) {
		System.out.println("public void run0(int x, int y)");
		System.out.println("x = " + x + ", y = " + y);
	}

	public static void main(String[] args){
		MethodOverloading mo = new MethodOverloading();
		mo.run0(1);
		mo.run0(2, 3);
		short a = 5;
		int k = mo.run0(4, a);
	}
}