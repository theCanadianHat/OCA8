package njh.c2.operators;

/*
	Special if else operator known as the
	turnary operator.

	boolean expression ? result if true : result if flase ;
*/

public class TernaryOperator{
	public static void main(String[] args) {
		boolean t = true;
		boolean f = false;
		//will always pring true
		System.out.println(t != f ? true : false);

		int x = t != t ? 1 : 4;
		System.out.println(x);
	}
}