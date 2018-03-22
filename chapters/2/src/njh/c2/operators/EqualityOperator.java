package njh.c2.operators;

/*
	Binary Operator.
	Compare two expressions for equality
	and returns a boolean value

	== should not be confused with =

	When two numeric types are compared with ==
	and the types are different. The smaller is
	promoted to the bigger type... so
	1 == 1.0 will return true
	1 is promoted to a double and compared to 1.0

	You can not mix types
	1 == "1"
	true == 1
	"hello" == true
	none of these will compile
*/

public class EqualityOperator {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;

		// System.out.println(1 == "1");
		// System.out.println(true == 1);
		// System.out.println("hello" == true);
		System.out.println(a == (1 > 0));
		System.out.println(a == a);
		System.out.println(a == b);

		int x = 1, y = 2, z = 3;
		long t = 2;
		System.out.println(x == y);
		System.out.println(z == (x + y));
		System.out.println(t == y);
	}
}