package njh.c2.operators;

/*
	Binary Operator.
	Compare two expressions and return
	a boolean value

	These also work with numeric types.
	These are known as bitwise operators when
	used with numeric types. Bitwise operators
	are not on the OCA8 exam.
*/

public class LogicalOperators {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;

		//And
		System.out.println(a & a);
		System.out.println(a & b);
		System.out.println(b & b);
		System.out.println(b & a);
		
		//Conditional And
		System.out.println(a && a);
		System.out.println(a && b);
		System.out.println(a && a);
		System.out.println(a && b);

		//Inclusive or
		System.out.println(a | a);
		System.out.println(a | b);
		System.out.println(b | b);
		System.out.println(b | a);

		//Conditional or
		System.out.println(a || a);
		System.out.println(a || b);
		System.out.println(b || b);
		System.out.println(b || a);

		//Exclusive or
		System.out.println(a ^ a);
		System.out.println(a ^ b);
		System.out.println(b ^ b);
		System.out.println(b ^ a);
	}
}