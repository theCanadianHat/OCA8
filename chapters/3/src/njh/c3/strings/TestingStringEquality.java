package njh.c3.strings;

/*
	What does it mean to be equal in Java?

	We know 1 equals 1 so 1 == 1

	Equality is simple for Java's basic types, but
	when it comes to reference types things get a
	bit more vague.

	I discuss equality for strings below.
*/

public class TestingStringEquality {
	public static void main(String[] args) {
			/*
				Remember string literals exist in the string pool.
				So here we get two references to the same string pool
				object.

			*/
			String one = "Hello";
			String two = "Hello";
			/*
				Checks the two references for equality
				Both references point to the same string
				in the string pool.
			*/
			System.out.println(one == two);	//true

			/*
				See UsingString.java if you forgot what trim() does.
				three is a reference to a string that is equivalent to "Hello".
				This reference (three) is not the same reference to the "Hello"
				in the string pool (one).
			*/
			String three = "Hello ".trim();
			String four = new String("Hello"); //a new reference to a new object of type String
			System.out.println(one == three);	//false
			System.out.println(two == four);	//false
			/*
				Even though both references point to the string "Hello",
				the references are not the same.
				== with references check to make sure the operands are 
				referencing the same object.
			*/
			System.out.println(one.equals(three)); //true
			/*
				equals() is a method every Java Object has.
				In String's case it checks the value of the
				caller and callee for equality.
			*/
		}	
}