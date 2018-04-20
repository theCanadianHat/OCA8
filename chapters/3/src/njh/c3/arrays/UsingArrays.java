package njh.c3.arrays;

import java.util.Arrays;
/*
	Arrays are a powerful tool
	They are fixed in length
	Fast at indexing
	Java considers arrays as a reference data type (nullable)

	An array is a collection of references to objects, the objects
	are not stored in the array.
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

		/*
			Arrays hold references, and arrays are reference objects.
			So you can have an array of arrays.
			Count the braces, thats the number of dimensions the array has.
		*/
		int[] _2dArray1[] = new int[3][3];
		int _2dArray2[][] = new int[3][3];
		int[][] _2dArray3 = new int[3][3];

		/*
			Like one dimensional arrays you can specify the elements of the
			array. Also not all arrays must be the same length.
		*/
		int[][] specific2dArray = {{1, 2, 3},{4, 5},{6}};

		/*
			The most common way of iterating through a multidimensional
			array is nest for loops.
		*/
		for (int i = 0; i < specific2dArray.length; i++) {//going through the outer most array (the array of arrays)
			
			for (int j = 0; j < specific2dArray[i].length; j++) {
					System.out.println("element at specific2dArray[" + i + "][" + j + "] is " + specific2dArray[i][j]);
			}

		}
	}

}