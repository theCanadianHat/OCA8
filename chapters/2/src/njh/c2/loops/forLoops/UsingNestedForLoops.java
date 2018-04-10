package njh.c2.loops.forLoops;

import java.util.Arrays;
import java.util.List;
import java.util.Formatter;

/*
	Nested for loops are somewhat common
	Take the time to understand what is going on
	and how to use them
*/

public class UsingNestedForLoops {
	final static int ARRAY_SIZE = 3;
	public static void main(String[] args) {
		/*
			Most common uses of nested for loops are 
			used in conjunction with 2D arrays

			[][][]
			[][][]
			[][][]

			So heres an example to help illustrate 
		*/
		int[][] _2Darray = new int [ARRAY_SIZE] [ARRAY_SIZE];
		int count = 0;
		//fill array with numbers
		for(int i = 0; i < ARRAY_SIZE; i++) //no braces here is ok since the body is just a for statement
			for (int j = 0; j < ARRAY_SIZE; j++)
				_2Darray[i][j] = count++;

		//print elements of array
		for (int a = 0; a < ARRAY_SIZE; a++) {
			for (int b = 0; b < ARRAY_SIZE; b++) {
				System.out.println(_2Darray[a][b]);
			}
		}

		print2dArray(_2Darray);
	}

	private static void print2dArray(int[][] array){
		StringBuilder sb = new StringBuilder();

		for (int x = 0; x < ARRAY_SIZE; x++) {
			int[] row = array[x];
			for (int y = 0; y < ARRAY_SIZE; y++) {
				if(y == 0)
					sb.append("[");

				sb.append(row[y]);

				if(y != (ARRAY_SIZE - 1)){
					sb.append(", ");
				}else{
					sb.append("]");
				}
			}
			System.out.println(sb.toString());
			sb.setLength(0);
		}
	}

	public static int[][] giveMeA2dSquareArray(int width){
		int[][] _2Darray = new int [width] [width];
		int count = 0;
		//fill array with numbers
		for(int i = 0; i < width; i++) //no braces here is ok since the body is just a for statement
			for (int j = 0; j < width; j++)
				_2Darray[i][j] = count++;

		return _2Darray;
	}

	public static void print2dSquareArray(int[][] array, int width){
		StringBuilder sb = new StringBuilder();
		Formatter fm = new Formatter(sb);

		for (int x = 0; x < width; x++) {
			int[] row = array[x];
			for (int y = 0; y < width; y++) {
				if(y == 0)
					sb.append("[");

				fm.format("%1$3s", row[y]);

				if(y != (width - 1)){
					sb.append(",");
				}else{
					sb.append("]");
				}
			}
			System.out.println(sb.toString());
			sb.setLength(0);
		}
	}
}