package njh.c4.methods.overloading;

import java.util.Arrays;

import static java.lang.System.out;

public class MethodOverloadingAndVarargs {
	public void run(int a){
		out.println("public void run(int a)");
		out.println("a = " + a);
	}

	public void run(int a, int b){
		out.println("public void run(int a, int b)");
		out.println("a = " + a + ", b = " + b);
	}

	public void run(int a, int b, int c){
		out.println("public void run(int a, int b, int c)");
		out.println("a = " + a + ", b = " + b + ", c = " + c);
	}

	public void run(int... a){
		out.println("public void run(int a...)");
		out.println("a = " + Arrays.toString(a));
	}

	/*
		Varargs are treated like arrays
		so this method signature looks the same to 
		Java as the one above
	*/
	//public void run(int[] a) {} //will not compile

	public static void main(String[] args){
		MethodOverloadingAndVarargs mov = new MethodOverloadingAndVarargs();
		mov.run(1);
		mov.run(1, 2);
		mov.run(1, 2, 3);
		mov.run(1, 2, 3, 4);
		mov.run(new int[] {1});
	}
}