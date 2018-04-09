package njh.c2.loops.forLoops;

import java.util.Arrays;
import java.util.List;

/*
	The for statement is similar to the while
	and do while statements.

	for(initialization;condition;updateStatement){
		//do something
	}//braces required if body is more than single line.

	infinite for statement 
	for( ; ; ){
		//doing something for a long time.
	}

	The enhanced for statement was designed for use
	with arrays and Collections

	for(dataType instance : collection){
		//do something
	}//braces required if body is more than single line.

*/

public class UsingForLoops {
	public static void main(String[] args) {
		/*
			x is an int, I initialize it to 0.
			x is checked if it is less than 3 
				- if this condition is true 
						the body -> System.out.println("Hello, I'm in a for loop!!!");
						and 
						update statement -> x++
						are executed
				- else exit loop (when x >= 3)
		*/
		for(int x = 0; x < 3; x++)
			System.out.println("Hello, I'm in a for loop!!!");

		//just declaring x, int default is 0 
		for(int x = 0; x < 10; x++){
			//modulus operator % checking the remainder of x / 2 for 0
			if(x % 2 == 0){
				System.out.println("I'm even! x = " + x);
			}
		}

		/*
			The rules for initialization are the same in a for
			statement as they are on a single line.

			You can declare multiple variables on the same line,
			but can't mix types or state the type twice.
			
			Don't do this
				int x = 0, int y = 0
				int x = 0, long y = 0
		*/
		for (int a = 2, b = 9; a < b; a++, b--) {
			System.out.println("a = " + a + ", b = " + b);
		}

		//You can redefine variables initialized outside of the for
		int e = 9;
		for (e = 10; e > 7; e--) {
			if(e == 9)
				System.out.println("It's " + e + " o'clock...and");
			if(e == 8)
				System.out.println("I haven't " + e + " yet, I am awfully hungry.");
		}
		//since e was originally defined prior to the for statement
		//I can still access it.
		System.out.println("e is still around, see; e = " + e);
		//but variables defined in the for are only accessible in the for
		for (int k = 0; k < -1; k++) {
			System.out.println("This will never happen.");
		}
		//System.out.println(k); //won't compile

		List<String> names = Arrays.asList("Noah", "Sarah");
		for(String name : names)
			System.out.println("Hello " + name);

		String[] rabbitNames = {"Lunardo", "Cannoli"};
		for (String rabbit : rabbitNames) {
			System.out.println(rabbit + " loves to hop, eat, and poo!!!");	
		}
	}
}