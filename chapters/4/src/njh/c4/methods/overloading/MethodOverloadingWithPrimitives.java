package njh.c4.methods.overloading;

import static java.lang.System.out;

/*
	Java will always pick the most specific signature it can.
	Java will put primitive in larger ones to match signartures.
	Java will not put larger primitves in smaller ones.
*/
public class MethodOverloadingWithPrimitives {
	public static void tricky(int i){
		out.println("public static void tricky(int i)");
	}

	public static void tricky(long l){
		out.println("public static void tricky(long l)");
	}

	public static void tricky(short s){
		out.println("public static void tricky(short s)");
	}

	public static void main(String[] args) {
		/*
			All of these find exact matches
			If we are to take out the method that uses a short
			Java would call the int method for it.

			Java will box your parameter into a bigger object to find a 
			match. It will not go into a smaller object. 

			Comment out all but the short method and try to run. The first two
			calls in main will not compile.
		*/
		tricky(1234);
		tricky(1234l);
		tricky((short)1234);
	}
}