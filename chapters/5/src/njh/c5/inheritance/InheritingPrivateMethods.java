package njh.c5.inheritance;

/*
	Sorry for the misleading title of this class.

	In Java, when you extend a class you only get
	access to the parent's public and protected 
	members. private members are not accessible
	outside of the class they are defined in.

	You can still define a method that is a 
	duplicate of the parent method, but this is
	not overriding the method
*/

public class InheritingPrivateMethods {
	public static void main(String[] args) {
		Raptor r1 = new Raptor();
		r1.getFeet(true);
		Bird r2 = new Raptor();
		r2.getFeet(false);

		Bird b1 = new Bird();
		b1.getFeet(true);
		r1.getFeet(1);
	}
}

class Bird {
	private void getFeet(){
		System.out.println("My feet don't always have talons.");
	}
	public void getFeet(boolean a) {this.getFeet();}
}

class Raptor extends Bird{
	//this method is unrelated to Bird.getFeet()
	private void getFeet(){
		System.out.println("My feet always have talons. SCREACH!!");
	}
  
	public void getFeet(boolean a) {this.getFeet();}
	//public void getFeet(int x) {super.getFeet();}//doesn't compile
	public void getFeet(int x) {super.getFeet(true);}

}