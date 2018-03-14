package njh.c2.operators;
/*
	Operators used for arithmetic in Java have 
	almost the same precedence as those found in
	Algebra.

	Please - Parentheses are highest in Java 				()
	excuse (no exponent operator)
	my dear - Multiplication and division come			*, /, %
						next.
	aunt sally - Addition and subtraction are last.	+, -

	Operators of the same precedence are evaluated
	left to right.
*/
public class BinaryArithmeticOperators {
	public static void main(String[] args) {
		int x = 1 * 9 + 4;
		System.out.println("1 * 9 + 4 = " + x); //13
		x = 1 * 9 / 3;
		System.out.println("1 * 9 / 3 = " + x ); //3
		x = 2 * (9 + 4);
		System.out.println("2 * (9 + 4) = " + x); //26
		x = 11 - 2 + 4;
		System.out.println("11 - 2 + 4 = " + x); //13
		x = 11 + 2 - 4;
		System.out.println("11 + 2 - 4 = " + x); //9
		x = 1 + 9 * 4;
		System.out.println("1 + 9 * 4 = " + x); //37

		/*
			The Modulus operator is %
			% returns the remainder of division.
			4 % 3 = 1
			4 % 2 = 0
			4 % 1 = 0
		*/
		x = 4 % 3;
		System.out.println("4 % 3 = " + x); //1
		x = 4 % 2;
		System.out.println("4 % 2 = " + x); //0
		x = 4 % 1;
		System.out.println("4 % 1 = " + x); //0
		x = 4 % 5;
		System.out.println("4 % 5 = " + x); //4


		/*
			All the previous examples are using just
			ints.

			When arithmetic is done with different types
			Java will promote smaller types to larger ones.
			The result will be of the type Java promotes to.
		*/
		int a = 1;
		long b = 2L;
		//a will be promoted to long, and a long value will be returned
		System.out.println(a + b); //3

		float c = 1f;
		double d = 4;
		//c is promoted to double
		System.out.println(d - c); //3.0
		//b is promoted to float
		System.out.println(c / b); //0.5

		/*
			The smaller types (byte, short, char) are promoted to
			ints when they are used with binary arithmetic operators,
			even if neither of the operands are ints
		*/
		char e = 4;
		System.out.println(e + e); //8
		/*
			e gets promoted to int since it is a char and is being used
			with a binary arithmetic operator
			the promoted e will be promoted to a long to be added to b
			the result of e and b will be promoted to a float to be 
			divided by c
			the result of the promoted float and c will be a float
		*/
		float result = (e + b) / c;
		System.out.println(result); //6.0
	}
}