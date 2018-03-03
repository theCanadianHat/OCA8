package njh.c4.methods.overloading;

import static java.lang.System.out;

public class MethodOverloadingAndAutoboxing {
		/*
			If you comment out one of these methods this code will
			still compile and run. When Java can't match a primative exactly
			it will autobox it to match a signature.

			If tryMe that takes an int is commented out, the calls made in main
			with the int variable will autobox that paramenter into an Integer
			object.

			If tryMe that take an Integer is commented out, the calls made in
			main with the Integer variable will have their int value taken as
			the parameter value.
		*/
		// public static void tryMe(int x){
		// 	out.println("public static void tryMe(int x)");
		// 	out.println("x = " + x);
		// }
	
		// public static void tryMe(Integer x){
		// 	out.println("public static void tryMe(Integer x)");
		// 	out.println("x = " + x);
		// }

		/*
			If you comment out the other two methods the method calls
			in main will not compile. Java will only autobox once. It
			will convert an int to an Integer but not an Integer to a 
			Long.
		*/
		public static void tryMe(Long x) {
			out.println("public static void tryMe(Long x)");
			out.println("x = " + x);
		}

	public static void main(String[] args){
		int a = 1;
		Integer b = 5;

		tryMe(a);
		tryMe(9L);
		tryMe(b);
	}
}