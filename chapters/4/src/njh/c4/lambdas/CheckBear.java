package njh.c4.lambdas;

/*
	This is a functional interface.

	It can be replaced by the Java provided functional
	interface called Predicate which is found in the package
	java.util.function
*/

public interface CheckBear {
	boolean test(Bear bear);
}