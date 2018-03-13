package njh.c1.variables.scope;
/*
	{ } denote code blocks.
	They also denote scope.

	Variables that are defined can be used in
	code blocks inside the scope the variable
	was defined.

	Variables defined with in a method are known
	as local variables.
*/
public class UnderstandingVariableScope {//class scope
	String name; 

	UnderstandingVariableScope(String shame){//constructor scope
		name = shame;
	}//end of constructor scope

	public static void main(String[] args) {//method scope
		//local variables
		UnderstandingVariableScope uvs = new UnderstandingVariableScope("What?");
		int y = 9;
		if(true){//if scope
			/*
				This if loop will always happen

				x is initialized to 0, but is only
				accessible in the scope of this if
				statement

				y was initialized in the method scope.
				the if scope is withing the method scope
				so y is accessible here.
			*/
			int x = 0;
			y = 10;
		}//end of if scope

		/*
			We can not access x anymore. x was never 
			initialized in the method scope. x was 
			out of scope at the end of the if.
		*/
		//System.out.println(x); //wont compile
		System.out.println(y);
	}//end of method scope
}//end of class scope