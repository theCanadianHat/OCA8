package njh.c5.inheritance;

/*
	Overriding a method is redefining it in the child
	class. The signature must be the same as the parent
	method. The parameter list must match, and the return
	type must be covariant. The overriding method (in the child class)
	must be at least as accessible as the method in the parent class.
	The overriding method can no throw a new checked exception or a 
	broader exception than the method in the parent class. If the method
	in the parent class returns a value, the child's override must return
	the same or a subclass of the type returned in the parent class.
*/

public class OverridingMethods{
	public static void main(String[] args) {
		BaseClass base = new BaseClass();
		ChildClass child1 = new ChildClass();
		base.sayHi();	//Hi
		child1.sayHi();	//Hello
		child1.callParentSayHi();	//Hi
		child1.sayBye();	//Bye Bye

		/*
			You get the functionality of the right side of the
			assignment. In this case ChildClass.
		*/
		BaseClass base2 = new ChildClass();
		base2.sayHi();	//Hello

		try{
			base.throwCustomException();
		}catch(MyCheckedException1 e){
			System.out.println("Caught a MyCheckedException1! First");
		}



		try{
			base2.throwCustomException();
		}
		/*
			This catch is redundant. A MyCheckedException2 is a 
			MyCheckedException1, so with out this catch the second
			catch would get hit. 
		*/
		catch(MyCheckedException2 e){
			System.out.println("Caught a MyCheckedException2! First");
		}
		/*
			this catch is needed because I could have called
			the parent method in the overridden method, which
			would possibly throw a MyCheckedException1. With out
			this catch the code doesn't compile.
		*/
		catch(MyCheckedException1 e){
			if(e instanceof MyCheckedException2){
				System.out.println("Caught a MyCheckedException2! Second");
			}else{
				System.out.println("Caught a MyCheckedException1! Second");
			}
		}



		try{
			base2.throwException();
		}catch(Exception e){
			System.out.println("This won't print...");
		}

	}
}

class BaseClass{
	public void sayHi(){
		System.out.println("Hi!");
	}

	protected void sayBye(){
		System.out.print("Bye ");
	}

	public void throwCustomException() throws MyCheckedException1 {
		throw new MyCheckedException1();
	}

	public void throwException() throws Exception {
		throw new Exception();
	}
}

class ChildClass extends BaseClass {
	/*
		We are overriding sayHi in the child class.
		Instances of ChildClass will call this sayHi
		instead of the method defined in the parent class (BaseClass).
	*/
	public void sayHi(){
		System.out.println("Hello!");
	}

	/*
		If you want to call the method defined in the parent class, you 
		can access it with the reserved word super
	*/
	public void callParentSayHi(){
		super.sayHi();
	}

	//protected sayHi() {}
	/*
		The above will not compile because protected is not as accessible
		as public. Since public is the most accessible modifier, when overriding
		a public method the overriding method must be public as well.
	*/

	//public is fine here, since public is more accessible than protected
	public void sayBye(){
		super.sayBye();
		System.out.println("Bye");
	}

	public void throwCustomException() throws MyCheckedException2 {
		throw new MyCheckedException2();
	}

	/*
		I could define this method to throw
	*/
	public void throwException() throws Exception {
		System.out.println("I don't wanna throw it!");
	}
}

class MyCheckedException1 extends Exception {}
class MyCheckedException2 extends MyCheckedException1 {}