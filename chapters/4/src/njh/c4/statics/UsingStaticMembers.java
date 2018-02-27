package njh.c4.statics;

public class UsingStaticMembers {
	public static int count = 0;
	public static String name = "Bear";

	/*
		This instance method requires an instance of 
		UsingStaticMemebers to be called.
	*/
	public void nonStaticMethod() {}

	public static void staticMethod0() {}
	public static void staticMethod1() {
		/*
			Static methods can call other static methods.
			Since staticMethod0 is static and its being called from inside
			UsingStaticMembers the class type is not needed.
		*/
		staticMethod0();
	}

	public static void staticMethod3(){
		//nonStaticMethod(); //will not compile - can't call instance members from a static member
	}


	public static void main(String[] args) {
		UsingStaticMembers.count = 5;
		UsingStaticMembers usm1 = new UsingStaticMembers();
		UsingStaticMembers usm2 = new UsingStaticMembers();
		usm1.count = 6;
		usm2.count = 7;
		System.out.println(UsingStaticMembers.count);
		/*
			Even though usm2 gets set to null Java knows the object is it defined as.
			From the object Java knows the member is static, so it doesn't need an 
			instance to call the static member.
		*/
		usm2 = null;
		System.out.println(usm2.count);
		//nonStaticMethod(); //will not compile - can't call instance members from a static member
		usm1.nonStaticMethod(); //fine using required instance
	}
}