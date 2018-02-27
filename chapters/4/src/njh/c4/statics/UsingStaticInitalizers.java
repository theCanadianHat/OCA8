package njh.c4.statics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
	The order of initilzation is as follows
	1. Initialize the super class - follows same order as 2-4 just happens before subclass
	on same step.
	2. Initialize static members and static initializers
	3. Initialize instance members and instance initializers
	4. Constructors
*/

public class UsingStaticInitalizers extends UsingStaticInitalizersSuperClass {
	public static int x;
	//private static final int y; //won't compile since it is never initialized

	private int z;

	UsingStaticInitalizers(){
		super();
		System.out.println("In UsingStaticInitalizers constructor");
	}

	static {
		System.out.println("In UsingStaticInitalizers static initilizer 1");
		x = 0;
	}

	{
		System.out.println("In UsingStaticInitalizers instance initilizer 2");
	}

	{
		System.out.println("In UsingStaticInitalizers instance initilizer 1");
	}

	static {
		System.out.println("In UsingStaticInitalizers static initilizer 2");
	}

	public static void main(String[] args) {
		System.out.println("In main");
		UsingStaticInitalizers usi = new UsingStaticInitalizers();
	}
}