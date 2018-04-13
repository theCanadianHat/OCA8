package njh.c3.strings;

/*
	StringBuilder is a common class found in
	java.lang

	Unlike String, StringBuilder is mutable so 
	you can change the underlying string of characters.
*/

public class UsingStringBuilder{
	public static void main(String[] args) {
		/*
			This example will illustrate the power and
			performance of StringBuilder.
		*/
		String numbers = "";
		for(int i = 0; i <= 10; i++){
			/*
				This single line will append the value
				of i to numbers

				numbers is a String, it is immutable. So
				numbers changes reference to the new String
				created from the concatenation. The old value
				numbers used to reference is now eligible for
				garbage collection.

				First iteration:
					Given
						i = 0
						numbers = ""
					When i <= 10
						numbers = "0" //numbers used to be "", which is now eligible for garbage collection
						i = 1

				This will create a new String every time this line is executed. (Costly)
			*/	
			numbers += String.valueOf(i); 
		}
		System.out.println(numbers);		//012345678910

		/*
			Now these lines of code will do the same as above.
		*/
		StringBuilder numbersSb = new StringBuilder("");
		for (int i = 0; i <= 10; i++) {
			numbersSb.append(i); //not making a new String, just appending i to the underlying character sequence
		}
		System.out.println(numbersSb);	//012345678910

		//Constructors -- They all instantiate a StringBuilder object
		StringBuilder sb1 = new StringBuilder();				//default no argument constructor
		StringBuilder sb2 = new StringBuilder("Hello");	//sets char seq to Hello
		StringBuilder sb3 = new StringBuilder(44);			//reserve 44 slots for characters in seq

		System.out.println(sb1); //no output -- new line
		System.out.println(sb2); //Hello
		System.out.println(sb3); //no output -- new line

		/*
			Common StringBuilder methods
			
			Note that some of StringBuilder methods
			return a reference to the StringBuilder that
			called the method.
		*/
		StringBuilder state = new StringBuilder("Mississippi");
		/*
			public char charAt(int index)
			public int indexOf(String s)
			public int indexOf(String s, int start)
			public int length()
			public String substring(int start)
			public String substring(int start, int end)

			These methods are the same as String
		*/
		System.out.println(state.substring(state.indexOf("M"), state.indexOf("issip")));	//Miss
		System.out.println(state.length());																								//11
		System.out.println(state.charAt(state.length() - 1));															//i

		/*
			public StringBuilder append(String s)
			Append takes almost anything. It then adds the
			parameter to the end of the character sequence
		*/
		sb1.append("Look at me now!");
		System.out.println(sb1);//Look at me now!

		/*
			public StringBuilder insert(int offset, String s)
			Inserts characters into the character sequence at
			the offset index.
		*/
		sb1.insert(0, "No, ");
		System.out.println(sb1);//No, Look at me now!

		/*
			public StringBuilder delete(int start, int end)
			public StringBuilder deleteCharAt(int index)
			Delete is opposite of insert, the start index is
			inclusive and the end is exclusive.
		*/
		StringBuilder sb4 = sb1.delete(0, 4);
		System.out.println(sb4);//Look at me now!

		/*
			public StringBuilder reverse()
			Reverses the order of the character sequence
		*/
		sb4.reverse();
		System.out.println(sb1);//!won em ta kooL

		/*
			public StringBuilder toString()
			This method has been being called every time a 
			StringBuilder was used with a println statement.
			Returns the character sequence
		*/
		System.out.println(sb1.reverse());//Look at me now!
		System.out.println(sb4.toString());//Look at me now!
	}
}