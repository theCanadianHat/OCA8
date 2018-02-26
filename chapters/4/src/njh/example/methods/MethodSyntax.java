package njh.example.methods;

public class MethodSyntax{
	
	/*
		The parts of a method signature:

		Access Modifier	Specifier	Return Type	Method Name 	Parameter List	Exception Type		Method Body
		public					static		void				doSomething		(String name)		throws Exception	{	//doSomething}
	*/
	/*
		Access modifiers are required. Note that no access modifier is actually the default access.
		This is tricky due to there being no visual reserved word.

		Legal Access Modifiers:
			public - the method can be called from any class
			protected - can be called from the same package or subclass
			private - the method can only be called from within the same class
			blank (default access) - can be called from the same package
	*/
	public void doSomething0(int x) {
		System.out.println("public access");
	}
	protected void doSomething1(int x) {
		System.out.println("protected access");
	}
	private void doSomething2(int x) {
		System.out.println("private access");
	}
	void doSomething3(int x) {
		System.out.println("default access");
	}

	/*
		Specifiers are optional. If they are present they must come before the return type.
		They are allowed before the access modifier.

		Legal Specifiers: (Optional)
			static - belongs to the class not the instance of the class
			final - covered in Chapter 5
			abstract - covered in Chapter 5
			synchronized - on OCP exam
			native - not on OCA or OCP. Used when interacting with code written in another language i.e. (c++)
			strictfp - not on OCA or OCP. Used for making floating point calculations portable.
	*/
	public static void doSomethingStatic1() {
		System.out.println("public access static specifier");
	}

	static public void doSomethingStatic2() {
		System.out.println("static specifier public access");
	}

	/*
		Return type is required and must come before the method name. If the return type is not void, a return
		statement must be present in the method body.

		Return Type:
			Any Java type including primitives
			Use void if nothing is being returned
	*/
	public int doSomething4() {
		return 1;
	}

	public String doSomething5() {
		return "Hello";
	}

	public boolean doSomething6() {
		return true;
	}

	public void doSomething7() {
		//does nothing
		//returns nothing
	}

	/*
		Method name is required.

		Method Name:
			Follows standard Java identifier rules
			Method names can only contain letters, numbers, $, or _
			Can not be a reserved word
			Can not start with a number
			Should not start with capital letter
			Camel case for multi-word method names i.e. thisDoesSomethingCool()
	*/
	public void _valid() {}
	public void $alsoValid() {}
	public void st1ll_Valid$() {}
	public void NotRecommendedButValid() {}
	
	//invalid method names
	//public void 1234()
	//public int void()

	/*
		Parameter List:
			If method takes no parameters parentheses are still required
			Multiple parameters are delimited by a comma
			Varargs must come last in parameter list
	*/
	void doSomething8() {}
	void doSomething9(int x) {}
	void doSomething10( int x, int y, String name) {}
	void doSomething11( String name, int... ages) {}

	/*
		Exception Type: (Optional)
			If present must be declared here
			Multiple types are delimited by commas
	*/
	void doSomething12() throws IndexOutOfBoundsException {}
	void doSomething13() throws IllegalArgumentException, IndexOutOfBoundsException {}

	/*
		Method Body:
			All statements that should be performed by the method should be contained in {}
			Blank method bodies are allowed, but the {} are still required
	*/
	void doSomething14() {}
	void doSomething15() {
		int x = 3;
	}

	public static void main(String[]  args){
		MethodSyntax ms = new MethodSyntax();

		/*
			Since this code is written in the same class as these methods,
			they can all be called from here. Including the private method.
		*/
		ms.doSomething0(0);
		ms.doSomething1(0);
		ms.doSomething2(0);
		ms.doSomething3(0);

		/*
			Static methods don't need a class instance to be called.
		*/
		MethodSyntax.doSomethingStatic1();
		MethodSyntax.doSomethingStatic2();

		/*
			These methods return things, and they get printed out.
		*/
		System.out.println(ms.doSomething4());
		System.out.println(ms.doSomething5());
		System.out.println(ms.doSomething6());
	}
}