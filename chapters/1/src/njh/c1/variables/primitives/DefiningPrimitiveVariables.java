package njh.c1.variables.primitives;

/*
	These are the 8 primatives in Java

	You can cast smaller types into bigger ones
*/

public class DefiningPrimitiveVariables {
	public static void main(String[] args) {
		/*
			Member names are not allowed to start with numbers.
			Member names are allowed to start with $, _, and 
			leters.
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
		//byte numLights = numCells; //wont compile. Java wont let you lose percision
		byte numShades = (byte) numCells; //explicit cast causes 
		System.out.println(numShades);
	}
}