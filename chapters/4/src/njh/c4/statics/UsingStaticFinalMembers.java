package njh.c4.statics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UsingStaticFinalMembers {
	public static final int COUNT = 0;
	public static final int COUNT_OF_WOLVES = 1;
	public static final String NAME = "Wolf";
	public static final List<String> NAMES = new ArrayList<>();

	public static void main(String[] args) {
		/*
			A static final field is known as a constants. Java will make sure
			you don't try to change the refernce.
		*/
		//COUNT = 1; //won't compile

		/*
			This is allowed. You are not changing the reference of NAMES.
			NAMES still points to an ArrayList<String>, the same one it has always
			pointed to. We are just adding something to that list.
		*/
		NAMES.add("David");
		System.out.println(Arrays.toString(NAMES.toArray()));
		//This is not allowed. Java knows you can't change what NAMES refers to.
		//NAMES = new ArrayList<String>();
	}
}