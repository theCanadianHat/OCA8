package njh.c4.methods.constructors;

import static java.lang.System.out;

public class OverloadingConstructors {
	int a;
	int b;
	int c;

	/*
		Just like methods you can over load constructors.
		This follows the same rules as method overloading.
		They must have different parameters to be overloaded.
	*/

	OverloadingConstructors() {
		a = 0;
		b = 0;
		c = 0;
	}

	OverloadingConstructors(int a){
		//must be the first call in the constructor if using this()
		this(a, 22, 33); //used to call constructor that takes 2 ints
	}

	OverloadingConstructors(int a, int b){
		this(a, b, 99);
	}

	OverloadingConstructors(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("StringBuilder {\n");
		sb.append("\ta = " + this.a + "\n");
		sb.append("\tb = " + this.b + "\n");
		sb.append("\tc = " + this.c + "\n");
		sb.append("}\n");
		return sb.toString();
	}

	public static void main(String[] args){
		OverloadingConstructors oc1 = new OverloadingConstructors();
		OverloadingConstructors oc2 = new OverloadingConstructors(11);
		OverloadingConstructors oc3 = new OverloadingConstructors(77, 88);
		OverloadingConstructors oc4 = new OverloadingConstructors(44, 55, 66);

		out.println(oc1);
		out.println(oc2);
		out.println(oc3);
		out.println(oc4);
	}
}