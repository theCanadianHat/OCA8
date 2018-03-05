/*
	package has to be the first non commented line if present

	import ... 
	package ...

	will not compile.

	Tells Java where the class file is. Helps prevent naming
	clash.
*/
package njh.c1.packages;
/*
	java.util.lang is imprted by default

	import is used to load and access classes that are not in
	the same package.
	To use MethodsAndFields from here I have to import it.
	import comes after package, won't compile otherwise.

	Using a wildcard (*) in an import statement will import 
	all classes in a package. It must be at the end.
*/
import njh.c1.variables.references.classStructure.MethodsAndFields;

public class UsingPackagesAndImports {
	MethodsAndFields mf;
	public static void main(String[] args) {
		UsingPackagesAndImports upi = new UsingPackagesAndImports();
		upi.mf = new MethodsAndFields();
		upi.mf.setField("What What!?");
		System.out.println(upi.mf.getField());
	}
}