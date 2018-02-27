package njh.c4.statics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
	The order of initilzation is as follows
	1. Initialize the super class
	2. Initialize static members and static initializers
	3. Initialize instance members and instance initializers
	4. Constructors
*/

public class UsingStaticInitalizersSuperClass {
	UsingStaticInitalizersSuperClass(){
		System.out.println("In UsingStaticInitalizersSuperClass constructor");
	}

	static {
		System.out.println("In UsingStaticInitalizersSuperClass static initilizer 1");
	}

	{
		System.out.println("In UsingStaticInitalizersSuperClass instance initilizer 2");
	}

	{
		System.out.println("In UsingStaticInitalizersSuperClass instance initilizer 1");
	}

	static {
		System.out.println("In UsingStaticInitalizersSuperClass static initilizer 2");
	}
}