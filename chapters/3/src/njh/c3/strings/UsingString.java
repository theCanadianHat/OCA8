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
		/*
			public int length() 
			returns the length of the String
		*/
		int myNameLength = myName.length();
		System.out.println(myNameLength);	//4

		/*
			public char charAt(int index) 
			returns the character at the index in the String
		*/
		char aLetter = myName.charAt(2);
		System.out.println(aLetter);			//a

		/*
			public int indexOf(char c)
			public int indexOf(char c, int startIndex)
			public int indexOf(String s)
			public int indexOf(String s, int startIndex)
			returns the index of the first instance of the char or
			String. If the char or String is not present -1 is returned.
			If the method is provided a startIndex, then the search starts
			from that index.
		*/
		String insect = "Caterpillar";
		int index = insect.indexOf('N');
		System.out.println(index);				//-1
		index = insect.indexOf('r', 5);
		System.out.println(index);				//10
		index = insect.indexOf("ate");
		System.out.println(index);				//1
		index = insect.indexOf("pill", 3);
		System.out.println(index);				//5

		/*
			public String substring(int startIndex)
			public String substring(int startIndex, int endIndex)
			returns the substring starting at the startIndex (inclusive)
			and ending at the endIndex (exclusive)
		*/
		System.out.println(insect.substring(5));										//pillar
		System.out.println(insect.substring(0, 3));									//Cat
		System.out.println(insect.substring(insect.indexOf('a')));	//aterpillar

		/*
			public String toLowerCase()
			public String toUpperCase()
			both methods return a String of all lower case or upper case,
			respectfully, characters from the original String.
		*/
		String upper = insect.toUpperCase();			//Caterpillar
		System.out.println(upper);								//CATERPILLAR
		System.out.println(upper.toLowerCase());	//caterpillar

		/*
			public boolean equals(Object o)
			checks that two Strings have the exact same characters in the same
			order

			public boolean equalsIgnoreCase(String s)
			checks that two strings have the same characters in the same order,
			but will convert between upper and lower case characters
		*/
		System.out.println("asdf".equals("ASDF"));						//false
		System.out.println("asdf".equalsIgnoreCase("ASDF"));	//true
		System.out.println("asdf".equals("asdf"));						//true

		/*
			public boolean startsWith(String pre)
			checks that a String starts with a given String

			public boolean endsWith(String post)
			checks that a String ends with a given String
		*/
		System.out.println(insect.startsWith("cat"));		//false
		System.out.println(insect.startsWith("Cat"));		//true
		System.out.println(insect.endsWith("pillar"));	//true
		System.out.println(insect.endsWith("1"));				//false

		/*
			public boolean contains(String s)
			checks that a String contains another String
		*/
		System.out.println(insect.contains("cat"));	//false
		System.out.println(insect.contains("Cat"));	//true
		System.out.println(insect.contains("dog"));	//false

		/*
			public String replace(char old, char new)
			public String replace(CharSequence old, CharSequence new)
			both methods replace in all character(s) that match old
			with the character(s) of new
		*/
		System.out.println(insect.replace('a', 'A'));			//CAterpillAr
		System.out.println(insect.replace("Cat", "Dog"));	//Dogerpillar

		/*
			public String trim()
			removes whitespace from the beginning and end of a String
		*/
		System.out.println("---Start of trim()---");
		System.out.println("Original String:");
		System.out.println("\t    Look at all the spaces.     \n \n \t ");
		System.out.println("Trimmed String:");
		System.out.println("\t    Look at all the spaces.     \n \n \t ".trim());
		System.out.println("----End of trim()----");

	}
}