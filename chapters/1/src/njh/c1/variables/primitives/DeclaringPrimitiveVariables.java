package njh.c1.variables.primitives;

/*
	These are the 8 primitives in Java

	You can cast smaller types into bigger ones
*/

public class DeclaringPrimitiveVariables {
	public static void main(String[] args) {
		/*
			Member and class names can not start with numbers.
			Member and class names must start with $, _, and 
			letters. 
			Other characters in the name can be numbers.
			Words that are reserved in Java are not allowed as
			member or class names.
		*/
		
		boolean isCool = true; 	//true or false
		byte numCars = 1;			//8 bit integer
		short numHouses = 5;	//16 bit integer
		int numCats = 15000;			//32 bit integer
		long numCells = 84736583758L;		//64 bit integer, must end with L 
		//long numBells = 8583928593; //won't compile
		float costCar = 17343.93f;		//32 bit floating point (decimal), must end with f
		//float costBoat = 14805.43; // wont compile
		double costPlane = 9484738.8573;	//64 bit floating point	(decimal)
		char testGrade = 'A';		//16 bit unicode value
		//char homeworkGrade = "B"; //wont compile

		int numTurtles = numHouses; //int is bigger than short
		long numFarts = numTurtles; //long is bigger than int
		//byte numLights = numCells; //wont compile. Java wont let you lose precision
		byte numShades = (byte) numCells; //explicit cast 
		System.out.println(numShades);

		/*
			Specifying number literals in different formats
			Octal (0-7) - number literal with preceding 0
			HexaDecimal (0-9 -> A-F) - number literal with preceding 0x or 0X
			Binary (0-1) - number literal with preceding 0b or 0B
		*/
		byte octal8 = 010;
		System.out.println(octal8);
		short hex16 = 0X10;
		System.out.println(hex16);
		int binary2 = 0B10;
		System.out.println(binary2);

		/*
			Underscores can be used in numeric literals to help with reading large
			numbers.
			Underscores can not come at the beginning or the end of the numeric
			literals. They can not come right before or right after a decimal.

			These are the same value, one is just easier to read.
		*/
		long bigNumber1 = 123_456_789;
		long bigNumber2 = 123456789;

		//double broken = 234._532; //wont compile

		/*
			Declaring multiple variables on the same line is allowed as long
			as they are all the same type. 
			When declaring multiple variables the type of the variables can 
			only be declared once.
		*/

		int numBoats, numBikes;
		//int numTires, int numWheels; //does not compile
		int numColors; int numChairs;

		int numSkates = 9, numDogs;
		short numRopes = 1, numShoes = -1;
		//byte numHairs = 2, long numJumps = 7L; //doesn't compile
		double costGrapes = 3.3; float costHouse = 350000.34f;
	}
}