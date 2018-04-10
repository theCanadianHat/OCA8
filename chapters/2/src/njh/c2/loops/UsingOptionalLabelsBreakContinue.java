package njh.c2.loops;

import njh.c2.loops.forLoops.UsingNestedForLoops;

/*
	Optional labels are a pointer to a statement.
	They point for process flow to jump to or 
	break from.

	These can be used with if, while, and for loops.
	They are a single word followed by a colon (:)

	optionalLabel: while(boolenExpression){
		//do something
	}

	Labels follow the same rule as identifiers.
	Generally they are in all caps with underscores
	between words.
*/

public class UsingOptionalLabelsBreakContinue {
	public static void main(String[] args) {
		/*
			Like the code says, labels are more useful
			in nested loops.
		*/
		MY_LOOP: for (int x = 0; x < 5; x++) {
			if(x == 2){
				System.out.println("Pretty much...");
				break; //stop label
				/*
					The label is optional
					break without a label will break the closest
					inner loop that is currently being processed.
				*/
			}
			System.out.println("Labels are useless in a single loop!");
		}

		OUTTER: for (int a = 0; a > -5; a--) {
			INNER: for (int b = 0; b < 5; b++) {
				if(a == -2)
					continue OUTTER; //jump to label

				System.out.println(a + " ," + b);
			}
		}

		/*
			With square array 5^2 = 25
			so I get numbers 0 - 24
		*/
		int arrayWidth = 5;
		int numToFind = 17;
		int sqArray[][] = UsingNestedForLoops.giveMeA2dSquareArray(arrayWidth);

		//searching for a number in the array
		FIND_LOOP: for (int i = 0; i < arrayWidth; i++) {
			for (int j = 0; j < arrayWidth; j++) {
				if(sqArray[i][j] == numToFind){
					/*
						Once we find the number we are looking for
						Display its location in the array
						and quit the main loop
						no need to keep looking once we found it
					*/
					System.out.println(numToFind + " was found at: (" + i + ", " + j + ")");
					break FIND_LOOP;
				}
			}
			System.out.println(numToFind + " wasn't found in row " + i);
		}
		UsingNestedForLoops.print2dSquareArray(sqArray, arrayWidth);
	
		//print out only even number locations
		for (int n = 0; n < arrayWidth; n++) {
			for (int s = 0; s < arrayWidth; s++) {
				if(sqArray[n][s] % 2 == 1) //odd number don't care
					continue;

				System.out.println("I'm even " + sqArray[n][s]);
			}
		}
	}
}