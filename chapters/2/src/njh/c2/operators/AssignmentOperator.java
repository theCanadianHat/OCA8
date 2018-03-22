package njh.c2.operators;

/*
	Binary Operator.
	leftHandSide = rightHandSide;
	The assignment operator "=" sets a value
	(the right hand side) to a variable (the
	left hand side)

	Compound assignment operators combine arithmetic and
	assignment.
	a = a + b;
	is equivalent to
	a += b;
	as long as both a and b are defined.
	
*/

public class AssignmentOperator {
	public static void main(String[] args) {
		/*
			Using the assignment operator you can set
			the value of s to 3
		*/
		int s = 3;
		System.out.println(s);
		/*
			Java will promote smaller types to larger 
			ones, but will not compile if you try to 
			use lager types in smaller ones.
		*/
		//int s1 = 1.0 //won't compile
		//use explicit cast
		int s2 = (int) 1.0; //stored as 1
		System.out.println(s2);
		/*
			You can make multiple variables of the same
			type on the same line.
			You can not write the type twice.
		*/
		char a, b, c;
		//char d, char e, char f; //wont compile
		char g; char h; char i; //semicolons are fine.
		short x = 2, y, z = -3;
		System.out.println(x);
		System.out.println(z);

		
		long m = 3, n = 9;
		int o = 2;
		m -= n;
		
		/*
			When using a compound assignment operator you
			can cast implicitly.
			o = o * n;
			will not compile. Using *= will convert o
			to a long and cast the product of o and n into
			an int and store it in o.
		*/
		//o = o * n;
		o *= n;
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);

		/*
			The result of the assignment operator is the 
			assignment itself.
		*/

		int p = (o = 5);
		System.out.println(p);
	}
}