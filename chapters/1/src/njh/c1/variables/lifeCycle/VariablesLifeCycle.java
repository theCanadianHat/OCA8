package njh.c1.variables.lifeCycle;
/*
	All Java objects are stored in memory known
	as the heap. The heap is finite, so objects
	must be destroyed.

	Java takes care of this for you. Garbage
	collection in Java is executed when an 
	object's reference(s) is no longer in scope
	or there are no more references for the 
	object.
*/
public class VariablesLifeCycle {
	public static void main(String[] args) {
		String first, second;
		first = new String("A"); 
		second = new String("B");
		/*
			At this point we have 
				first -> "A"
				second -> "B"
		*/
		second = first; 
		/*
			Now we have
				first -> "A"
									^
				second ---'
				"B" 

			Nothing is pointing at "B". It is now
			available for garbage collection.
		*/				
		String third = second;
		/*
			Now
				first -->"A"
									^
				second ---|
				third  ---'
		*/
		second = null;
		/*
			Now we have
				first -> "A"
									^
				third ---'
				second

			second is pointing to null, which is
			nothing
		*/
	}
	/*
		At this poing all references to "A" are out of scope
		so garbage collection is initiated.
	*/
}