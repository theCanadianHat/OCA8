package njh.c4.methods;

/*
	Java is pass-by-value
	Variables are copied and passed to the method.
*/

public class PassingParametersToMethods {
	public static void main(String[] args){
		//i is copied and sent	
		int i = 439;
		 //No, you get a copy of an int
		willIChange1(i);
		System.out.println(i); //439
		int w = willIChange3(i);
		System.out.println(w); //944

		String x = "Change me";
		willIChange4(x);
		System.out.println(x);//Change me

		MyClass mc = new MyClass();
		mc.name = "Billy";
		mc.number = 5;
		//Yes, you get a copy of a reference to a MyClass
		willIChange2(mc);
		System.out.println(mc);
		/*
		Output:
		MyClass: {
			name: Nancy
			number: 7
		}
		*/
	}

	/*
		willIChange2 takes a reference type as its only
		parameter. This method is void in return type but
		affects the variable from main scope.
	*/
	public static void willIChange2(MyClass mc){
		mc.name = "Nancy";
		mc.number = 7;
	}

	public static void willIChange1(int i){
		i = -2;
	}

	public static int willIChange3(int w){
		return 944;
	}

	public static void willIChange4(String x){
		x = "We did it!";
	}
}