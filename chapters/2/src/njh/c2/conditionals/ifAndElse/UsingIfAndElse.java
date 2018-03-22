package njh.c2.conditionals.ifAndElse;

/*
	The if statement checks the expression between
	the parentheses.

	If the expression evaluates to true then the
	statements in the braces are executed.

	That code block is skipped otherwise.
*/

public class UsingIfAndElse {
	public static void main(String[] args) {
		if(true){
			System.out.println("Hello");
		}

		/*
			add something after the filename when
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

		if(args.length == 0){
			System.out.println("No arguments");
		}else if(args.length == 1){
			System.out.println("One argument");
		}else{
			System.out.println("More than one argument");
		}
	}
}