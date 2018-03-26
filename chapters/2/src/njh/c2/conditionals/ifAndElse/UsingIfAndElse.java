package njh.c2.conditionals.ifAndElse;

/*
	The if statement checks the expression between
	the parentheses.

	If the expression evaluates to true then the
	statements in the braces are executed.

	The code block after the failed if
	is skipped otherwise.

	else if and else may follow an if.

	if(experession A){ 
		//will happen if expression A is true
	}else if(expression B){
		//will happen if expression A is false
		//and expression B is true
	}else{
		//will happen is expression A is false
		//and expression B is false
	}
*/

public class UsingIfAndElse {
	public static void main(String[] args) {
		//true is always true,
		//so "Hello" is always printed.
		if(true){
			System.out.println("Hello");
		}

		/*
			Add something after the filename when
			running java <filename> args
		
			In this case the else statement is 
			executed anytime this program is ran without
			a command line argument.
		*/
		if(args.length > 0){
			System.out.println(args[0]);
		}else{
			System.out.println("World!");
		}

		//only one of these will get picked.
		if(args.length == 0){
			System.out.println("No arguments");
		}else if(args.length == 1){
			System.out.println("One argument");
		}else{
			System.out.println("More than one argument");
		}
	}
}