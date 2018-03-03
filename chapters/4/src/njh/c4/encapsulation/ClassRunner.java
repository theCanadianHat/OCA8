package njh.c4.encapsulation;

import static java.lang.System.out;

public class ClassRunner {
	public static void main(String[] args){
		EncapsulatedClass ec = new EncapsulatedClass();
		NonEncapsulatedClass nec = new NonEncapsulatedClass();

		//Public member fields can be access directly
		nec.a = -10;
		nec.b = 77;
		out.println(nec);

		/*
			Private member fields have to be accessed
			via public accessors, this encapsulates the
			underlying data. Controlling access to it.
		*/
		ec.setA(-66);
		ec.setB(947);
		out.println(ec);
	}
}