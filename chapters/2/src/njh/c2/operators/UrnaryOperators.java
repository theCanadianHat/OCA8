package njh.c2.operators;

/*
	Urnary operators have a single operand.
*/

public class UrnaryOperators {
	public static void main(String[] args) {
		//! negates, or flips, the value of a boolean
		boolean a = false;
		System.out.println(!a); //true

		//- negates, or flips, the value of number types
		byte b = 34;
		System.out.println(-b); //-34
		short c = -5;
		System.out.println(-c); //5
		int d = 8;
		System.out.println(-d); //-8
		long e = -2L;
		System.out.println(-e); //2
		float f = 5f;
		System.out.println(-f); //-5.0
		double g = -4;
		System.out.println(-g); //4.0

		/*
			These two operators only work with their
			matching types.
		*/
		//System.out.println(-a); //wont compile
		//System.out.println(!b); //wont compile

		/*
			++ and -- increment and decrement respectfully
			the value of a variable
			They can only be applied to numeric operands
			They can prepend or append to a variable
			When the operator is prepended to the operand
			the increment or decrement is evaluated first.
			When the operator is appended to the operand
			the increment or decrement is evaluated last.
		*/

		byte b1 = ++b;
		System.out.println(b1); //35
		System.out.println(b); //35
		short c1 = --c;
		System.out.println(c1); //-6
		System.out.println(c); //-6
		int d1 = d++;
		System.out.println(d1); //8
		System.out.println(d); //9
		long e1 = e--;
		System.out.println(e1); //-2
		System.out.println(e); //-3
	}
}