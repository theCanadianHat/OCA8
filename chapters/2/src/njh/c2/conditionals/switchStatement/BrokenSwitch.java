package njh.c2.conditionals.switchStatement;

/*
	switch statements can be a pain

	make sure the data type in the switch 
	matches those of the cases, and that the
	value of the case statement must be a 
	literal, enum constant, or a final constant

	remember valid data types
	byte or Byte
	short or Short
	char or Character
	int or Integer
	String
	enum constants
*/

public class BrokenSwitch {
	public static void main(String[] args) {
		int numOfCars = 4;

		switch(numOfCars){
			case 4: 
				System.out.println("4 cars");
				break;
			case '4': //char gets promoted to an int
				System.out.println("4 cars");
				break;
			case "4": //wont compile, String type
				System.out.println("4 cars");
				break;
			case true: //wont compile, boolen not supported by switch
				System.out.println("4 cars");
				break;
			default:
				System.out.println("Default number of cars");
				break;
		}
	}
}