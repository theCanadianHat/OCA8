package njh.c3.strings;

/*
	An immutable sequence of characters
*/

public class UsingString {
	public static void main(String[] args) {
		/*
			This is a string literal. String literals
			are stored in the String Pool. You can have
			multiple references to the same literal. There
			is only one literal in the String Pool no matter
			how many references you make for it.

			Note no new keyword is used for String literals.
		*/
		String myName = "Noah";
		/*
			This is tell the JVM to not add a String to the String
			pool. It is still perfectly valid.
		*/
		String yourName = new String("I don't know who you are.");

		String concatenation = myName.concat(" Herron");
		/*
			String has many member methods, and most of 
			them return a String. This is because String
			is immutable. Once you create the String object
			it is not allowed to change.

			Note the method above does not change myName
		*/
		System.out.println(concatenation);
		System.out.println(myName);

		/*
			When using Strings you can concatenate them useing the
			+ symbol. The + symbol will check the two operands for
			type. If either are a String it will convert the non-String
			and concatenate.
		*/
		System.out.println(1 + 2);					//3
		System.out.println(1 + "2");				//12
		System.out.println("h" + 1 + "y");	//h1y
		System.out.println(2 + 1 + "s");		//3s

		String o = "1";
		o += 2; 	//String + int
		o += "3";	//String + String
		System.out.println(o);	//123

		int u = 4;
		u += 3;
		String i = "" + u + 1; 
		String k = u + 1 + "";
		i += 21;
		System.out.println(u + ", " + i + ", " + k);
		//u = 7
		//i = 7121
		//k = 8

		/*
			Commonly used String methods
		*/
		
	}
}