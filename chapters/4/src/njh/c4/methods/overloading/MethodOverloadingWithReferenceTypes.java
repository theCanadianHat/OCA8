package njh.c4.methods.overloading;

import static java.lang.System.out;

/*
	Java will always pick the most specific signature it can.
	Even though a String is an Object, the signature that takes
	a String as a parameter is called.

	As for the second call, Java looks for an int signature. It
	doesn't find one so it autoboxes to an Integer. Still doesn't
	match so it uses the Object signature. 
*/
public class MethodOverloadingWithReferenceTypes {
	public static void tricky(String s){
		out.println("public static void tricky(String s)");
	}

	public static void tricky(Object o){
		out.println("public static void tricky(Object o)");
	}

	public static void main(String[] args) {
		tricky("?");
		tricky(1234);
	}
}