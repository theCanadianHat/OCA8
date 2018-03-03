package njh.c4.encapsulation;

/*
	These are the JavaBean naming conventions for 
	defining a class. This convention will be tested
	on the OCA8.

	The method name must start with is/get/set and 
	followed by the first letter of the field capitalized
	followed by the rest of the field name.
*/
public class JavaBeansConventions {
	//fields are private
	private int numCars;
	private boolean fast;

	/*
		Getters for non boolean fields start with get.
		Getters for boolean fields start with is or get.
	*/
	public int getNumCars() { return numCars; }
	public boolean isFast() { return fast; }

	/*
		Setters start with set.
	*/
	public void setNumCars(int num) { numCars = num; }
	public void setFast(boolen f) { fast = f; }
}