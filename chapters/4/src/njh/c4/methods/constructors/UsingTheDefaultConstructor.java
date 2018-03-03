package njh.c4.methods.constructors;

import static java.lang.System.out;

public class UsingTheDefaultConstructor {
	int a;
	String b;

	// UsingTheDefaultConstructor(int x, String y){
	// 	a = x;
	// 	b = y;
	// }

	public static void main(String[] args){
		/*
			We never wrote this constructor. Java will give this to you
			for free if and only if you did not write ANY constructor.

			Uncomment the constructor to see this code faile to compile.
		*/
		UsingTheDefaultConstructor utdc = new UsingTheDefaultConstructor();
		utdc.a = 6;
		utdc.b = "I work!";
		out.println("utdc.a = " + utdc.a);
		out.println("utdc.b = " + utdc.b);
	}
}