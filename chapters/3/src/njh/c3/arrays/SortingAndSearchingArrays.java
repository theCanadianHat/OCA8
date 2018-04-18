package njh.c3.arrays;
//have to import Arrays
import java.util.Arrays;

/*
	Sorting is powerful and useful.
	sorts an array in place.
	sorts ascending by default.
*/

public class SortingAndSearchingArrays{
	public static void main(String[] args) {

		int[] numbers = {3, 4, 1, 2, 8};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		/*
			3
			4
			1
			2
			8
		*/
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		/*
			1
			2
			3
			4
			8
		*/
		//works with Strings too, sorts alphabetically
		String[] names = {"Zach", "Mike", "Mary", "Robert", "Alice", "Jerry"};
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		/*
			Alice
			Jerry
			Mary
			Mike
			Robert
			Zach
		*/
		//tricky with string numbers; sort 1-9
		String[] stringNumbers = {"9", "10", "11", "4", "50", "100"};
		Arrays.sort(stringNumbers);
		for (int i = 0; i < stringNumbers.length; i++) {
			System.out.println(stringNumbers[i]);
		}
		/*
			10
			100
			11
			4
			50
			9
		*/
		/*
			The Arrays util also gives a method for searching.
			This method assumes you are searching on a sorted list.
			If the list is not sorted, the results are unpredictable.

			The result of binarySearch on a sorted list
				1 - Target element found in sorted array:
						index of target in list
				2 - Target element not found in sorted array:
						A negative number. This result is equal to 
						the index of where the target would need to
						be inserted into the array while preserving 
						sort order, minus one.
				3 - Unsorted array:
						Unpredictable
		*/
		int[] sorted = {1, 3, 5, 7, 11};
		System.out.println(Arrays.binarySearch(sorted, 5)); 	// 2 - positive result : 5 was found at index 2
		System.out.println(Arrays.binarySearch(sorted, 0)); 	// -1 - negative result : 0 is not in the array, -1 is equal to the index of (0) where you would have to insert 0 to preserve sort order, minus 1 -> -1 = -|0 - 1|
		System.out.println(Arrays.binarySearch(sorted, 2)); 	// -2 = 
		System.out.println(Arrays.binarySearch(sorted, 9)); 	// -5
		System.out.println(Arrays.binarySearch(sorted, 10));	// -5
		System.out.println(Arrays.binarySearch(sorted, 15));	// -6

		int[] unsorted = {6, 5, 4};
		System.out.println(Arrays.binarySearch(unsorted, 6)); //this output doesn't matter, since the list is not sorted.
		System.out.println(Arrays.binarySearch(unsorted, 5));
		System.out.println(Arrays.binarySearch(unsorted, 4));
		System.out.println(Arrays.binarySearch(unsorted, 7));
		System.out.println(Arrays.binarySearch(unsorted, 3));

		Arrays.sort(unsorted);	//Now we can trust the search
		System.out.println(Arrays.binarySearch(unsorted, 6)); //2
		System.out.println(Arrays.binarySearch(unsorted, 5));	//1
		System.out.println(Arrays.binarySearch(unsorted, 4));	//0
		System.out.println(Arrays.binarySearch(unsorted, 7));	//-4
		System.out.println(Arrays.binarySearch(unsorted, 3));	//-1
	}
}