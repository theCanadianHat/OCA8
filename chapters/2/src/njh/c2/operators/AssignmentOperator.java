package njh.c2.operators;

/*
	Binary Operator.
	leftHandSide = rightHandSide;
	The assignment operator "=" sets a value
	(the right hand side) to a variable (the
	left hand side)
*/

public class AssignmentOperator {
	public static void main(String[] args) {
		/*
			Using the assignment operator you can set
			the value of s to 3
		*/
		int s = 3;
		/*
			Java will promote smaller types to larger 
			ones, but will not compile if you try to 
			use lager types in smaller ones.
		*/
		//int s1 = 1.0 //won't compile
		//use explicit cast
		int s2 = (int) 1.0; //stored as 1

		/*
			You can make multiple variables of the same
			type on the same line.
			You can not write the type twice.
		*/
		char a, b, c;
		//char d, char e, char f; //wont compile
		char g; char h; char i; //semicolons are fine.
		short x = 2, y, z = -3;
	}
}