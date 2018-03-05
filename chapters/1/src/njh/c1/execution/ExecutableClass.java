package njh.c1.execution;

import njh.c1.variables.references.classStructure.MethodsAndFields;

public class ExecutableClass {
	/*
		The main method is the start point of execution.
		It takes a array of Strings. You pass these in
		from the command line.
	*/
	public static void main(String[] args) {
		MethodsAndFields mf = new MethodsAndFields();

		System.out.println("Testing my ExecutableClass!");
		mf.setField("Testing a setter");
		System.out.println(mf.getField());
	}
}