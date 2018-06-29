package njh.c5.inheritance;

public class InheritingPrivateMethods {
	public static void main(String[] args) {
		Raptor r1 = new Raptor();
		r1.getFeet();
		Raptor r2 = new Bird();
		r2.getFeet();
	}
}

class Bird {
	private void getFeet(){
		System.out.println("My feet don't always have talons.");
	}
}

class Raptor extends Bird{
	private void getFeet(){
		System.out.println("My feet always have talons. SCREACH!!");
	}
}