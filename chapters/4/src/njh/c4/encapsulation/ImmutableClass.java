package njh.c4.encapsulation;

/*
	An immutable class is a class that can 
	not be changed after initialization.

	You can set the data once.
*/
public class ImmutableClass {
	//fields are private
	private int numCars;
	private boolean fast;

	//There can be 0 to n constructors
	ImmutableClass() {
		numCars = 0;
		fast = false;
	}

	ImmutableClass(int num, boolean f) {
		numCars = num;
		fast = f;
	}

	/*
		Use public getters to access private fields
	*/
	public int getNumCars() { return numCars; }
	public boolean isFast() { return fast; }
}