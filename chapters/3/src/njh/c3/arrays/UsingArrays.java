package njh.c3.arrays;

/*
	Arrays are a powerful tool
	They are fixed in length
	Fast at indexing


*/

public class UsingArrays {
	private final static int ARRAY1_SIZE = 4;
	private final static int ARRAY2_SIZE = 8;

	public static void main(String[] args) {
		/*
			Creating arrays:
			type[] variableName = new type[size]

			type - data type (primitive, Java object)
			variableName - reference to array
			size - non-negative number
			new - required when not specifying initial
			values of the array

			Note: the first set of [] can come after the 
			data type or variable name.
		*/
		//an array of ints of size 4
		int array1[] = new int[ARRAY1_SIZE]; // all zeros
		//an array of booleans of size 8
		boolean[] array2 = new boolean[ARRAY2_SIZE];	// all false

		//print out both arrays
		for (int i = 0; i < ARRAY2_SIZE; i++) {
			//i will keep increasing
			if(i < ARRAY1_SIZE)
				System.out.println(array1[i]); //accessing element i of array1
			System.out.println(array2[i]);
		}

		/*
			Specify the elements of the array. The size
			can be deduced from the list of elements.

		*/
		String[] specific = {"1", "2", "3"};
		//using array's property length to figure out how far to go
		for (int i = 0; i < specific.length; i++) {
			System.out.println(specific[i]);
		}
		/*
			1
			2
			3
		*/


	}

}