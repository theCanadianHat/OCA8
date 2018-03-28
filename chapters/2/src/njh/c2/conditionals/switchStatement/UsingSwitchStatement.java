package njh.c2.conditionals.switchStatement;

/*
	A switch statement is a compounded if, else if, else
	structure. 

	Supported data types:
		byte and Byte
		short and Short
		char and Character
		int and Integer
		String
		Enum values

	The value in each case statement must be a compile time
	constant of the same data type in the switch expression.
	This means you can only use literals, enum constants, and
	final constant variables of the same data type in the case
	expressions.

	swtich(expression){
		case expressionToMatch:
			break;								//breaks are optional
		case defualt:						//defaut case optional
			break;
	}

	The break statement will break out of the switch block
	The default case will be executed if it is present and no
	other case expression is met.
*/

public class UsingSwitchStatement {
	public static void main(String[] args) {
		int numOfCars = 4;

		switch(numOfCars){
			case 4: //since numOfCars is 4 this block will be executed.
				System.out.println("4 cars");
				break;//breaks tells program flow to exit switch
			default:
				System.out.println("Default number of cars");
				break;
		}

		switch(numOfCars){
			case 4: //since numOfCars is 4 this block will be executed.
				System.out.println("4 cars, no breaks");
			default:
				System.out.println("Default number of cars");
				break;
		}

		switch(numOfCars){
			case 4: //since numOfCars is 4 this block will be executed.
				System.out.println("4 cars, no breaks, no default");
		}

		aBOrC('a');
		aBOrC('B');
		aBOrC('c');
		aBOrC('h');
	}

	public static void aBOrC(char letter){
		switch(letter){
			case 'a':
			case 'A':
				System.out.println("Thats an A"); //happens if letter is a or A
				break;
			case 'b':
			case 'B':
				System.out.println("Thats an B");
				break;
			case 'c':
			case 'C':
				System.out.println("Thats an C");
				break;
			default:
				System.out.println("I don't know what letter you sent me.");
				break;
		}
	}
}