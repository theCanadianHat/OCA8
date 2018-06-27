package njh.c5.inheritance;

/*
	You can define multiple classes in the same file.
	At most one class can be declared as public, and 
	the file name must match the public class name.
	Like the one below.
*/

public class UnderstandingClassAccessModifiers{
	public static void main(String[] args) {
		System.out.println("I compile and run!");
	}
}

/*
	You can define as many default access classes as 
	you want in a single file. They can only be accessed
	from within their package.
	njh.c5.inheritance in this case.
*/
class CanOnlyBeUsedInThisPackage1{}
class CanOnlyBeUsedInThisPackage2{}
class CanOnlyBeUsedInThisPackage3{}
class CanOnlyBeUsedInThisPackage4{}
class CanOnlyBeUsedInThisPackage5{}
class CanOnlyBeUsedInThisPackage6{}

//literally as many as you want.