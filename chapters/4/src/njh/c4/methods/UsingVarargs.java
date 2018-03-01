package njh.c4.methods;

import java.util.Arrays;

public class UsingVarargs{

	private String arrayToString(int[] x){
		return Arrays.toString(x);
	}

	void run0(int x) {
		System.out.println("Called: void run0(int x)");
		System.out.println("\tx = " + x + "\n");
	}

	void run00(int x, int... y) {
		System.out.println("Called: void run00(int x, int... y)");
		System.out.println("\tx = " + x + ", y = " + arrayToString(y));
		System.out.println("\ty.length = " + y.length + "\n");

	}

	void run1(int x, int y) {
		System.out.println("Called: void run1(int x, int y)");
		System.out.println("\tx = " + x + ", y = " + y + "\n");
	}

	void run2(int... x) {
		System.out.println("Called: void run2(int... x)");
		System.out.println("\tx = " + arrayToString(x));
		System.out.println("\tx.length = " + x.length + "\n");
	}

	/*
		//Does not compile
		void run3(int... a, int b) {}
		void run3(int... a, String b) {}
		void run3(int... a, int... b) {}
	*/

	public static void main(String[] args){
		UsingVarargs uv = new UsingVarargs();
		uv.run0(1);
		uv.run1(1,2);
		uv.run00(1,2);
	  uv.run00(1,2,3);
		uv.run2(1,2,3);
		uv.run2(new int[] {4,5,6});
	}
}