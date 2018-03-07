package njh.c1.variables.lifeCycle;

public class OrderOfInitialization {
	int field1;
	String field2;
	/*
		This is an instance initialization block
		They are ran in the order in which they appear
		All fields and instance initialization blocks are 
		ran before the constructor is run.
	*/
	//1st
	{
		this.field1 = 5;
		this.field2 = "Text";
		System.out.println(field1);
		System.out.println(field2);
	}

	OrderOfInitialization(){
		field1 = 8;
		field2 = "Words";
	}

	//2nd
	{
		System.out.println("Beep");
	}

	public static void main(String[] args) {
		
		OrderOfInitialization oi = new OrderOfInitialization();
		//4th
		System.out.println(oi.field1);
		System.out.println(oi.field2);		
	}

	//3rd
	{
		System.out.println("Boop");
	}
}