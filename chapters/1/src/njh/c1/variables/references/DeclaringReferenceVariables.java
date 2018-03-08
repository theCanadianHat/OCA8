package njh.c1.variables.references;

/*
	When you declare a reference variable
	you have to use the new key word followed by
	the constructor.
	
	Reference types have both fields and methods.
	Primitives can be passed into methods but do 
	not have methods called from them.
*/
public class DeclaringReferenceVariables {
	public static void main(String[] args) {
		MySimpleClass ref = new MySimpleClass();
		MyOtherSimpleClass otherRef = new MyOtherSimpleClass();
		print("Default values for uninitialized variables:");
		print("\tboolean: " + ref.a);
		print("\tbyte: " + ref.b);
		print("\tshort: " + ref.c);
		print("\tint: " + ref.d);
		print("\tlong: " + ref.e);
		print("\tdouble: " + ref.f);
		print("\tfloat: " + ref.g);
		print("\tchar: " + ref.h); // '\u0000'
		print("\treference: " + otherRef.ref);

		//setting field a on the MySimpleClass instance
		ref.a = true;
		//accessing field a on the MySimpleClass instance
		System.out.println(ref.a);
		//calling print method on the MySimpleClass instance
		ref.print();

		int x = 10;
		//x.length() //won't compile

		//otherRef.ref.print() // NullPointerException
		otherRef.ref = new MySimpleClass();
		otherRef.ref.print(); //works
	}

	public static void print(String s){
		System.out.println(s);
	}
}