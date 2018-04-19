package njh.c3.arrays;

//must import ArrayList
import java.util.ArrayList;
import java.util.List;

/*
	ArrayList is like an array, but the size is not
	fixed. You can add and remove from an ArrayList.
	This is not possible with an array due to its 
	fixed size at instantiation.
*/

public class UsingArrayList{
	public static void main(String[] args) {
		//creating ArrayLists before Java 5
		ArrayList list0 = new ArrayList();			//default no argument constructor - 
		ArrayList list1 = new ArrayList(5);
		ArrayList list2 = new ArrayList(list1);
		//Java 5 introduced generics, so we can specify the type of object to store in the list
		ArrayList<String> listOfStrings0 = new ArrayList<String>();	//being explicit in the constructor
		ArrayList<String> listOfStrings1 = new ArrayList<>();				//Since Java 7, the type in the constructor can be omitted the <> is still required
		/*
			List is an interface, so it can't be instantiated.
			ArrayList is an implementation of List, you can reference
			an ArrayList as a List
		*/
		List<String> list3 = new ArrayList<>();
		// List<String> list4 = new List<>(); //won't compile
		// ArrayList<String> list5 = new List<>();	//won't compile

		//Common ArrayList methods
		/*
			public boolean add(E element)
			public void add(int index, E element)

			Adds the element to the list, if index is supplied the element
			is added at that specific index.
			For ArrayList add will always return true.
		*/
		list0.add("Hello");
		list0.add(1);
		list0.add(true);
		System.out.println(list0); //[Hello, 1, true]

		/*
			Since list0 does not specify the type of the objects in the 
			list, all elements added will be converted into Objects.
			If we try this with another list there will be issues.
		*/
		listOfStrings0.add("Hello");
		// listOfStrings0.add(1);		//won't compile
		// listOfStrings0.add(true);	//won't compile
		System.out.println(listOfStrings0); //[Hello]

		/*
			public boolean remove(Object o)
			public E remove(int index)

			Removes the first matching element and returns whether it found
			it or not. Also removes and returns the element at index.
		*/
		boolean removed = list0.remove("Hello");	//finds first match for an int of 1
		System.out.println(removed);				//true
		System.out.println(list0);					//[1, true]
		removed = list0.remove(false);			//doesn't find boolean of false in list
		System.out.println(removed);				//false
		System.out.println(list0);					//[1, true]

		Object element = list0.remove(0);		//the element out of the list is returned 
		System.out.println(element);				//1
		System.out.println(list0);					//[true]

		
	}
}