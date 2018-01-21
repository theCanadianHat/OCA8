import java.util.function.Predicate;
public class AssessmentTestQuestion17 {
	public static void main (String[] args) {
		System.out.println(test(i -> i == 5));
		// System.out.println(test(i -> {i == 5;}));
		System.out.println(test((i) -> i == 5));
		// System.out.println(test((int i)  -> i == 5));
		// System.out.println(test((int i) -> {return i == 5;}));
		System.out.println(test((i) -> {return i == 5;}));
	}

	private static boolean test(Predicate<Integer> p) {
		return p.test(5);
	}
}
/*
AssessmentTestQuestion17.java:7: error: method test in class AssessmentTestQuestion17 cannot be applied to given types;
                System.out.println(test((int i)  -> i == 5));
                                   ^
  required: Predicate<Integer>
  found: (int i)->i == 5
  reason: argument mismatch; incompatible parameter types in lambda expression
AssessmentTestQuestion17.java:8: error: method test in class AssessmentTestQuestion17 cannot be applied to given types;
                System.out.println(test((int i) -> {return i == 5;}));
                                   ^
  required: Predicate<Integer>
  found: (int i)->{[...] 5; }
  reason: argument mismatch; incompatible parameter types in lambda expression
2 errors
*/