package njh.c2.loops.whileLoops;

/*
	A do while loop is very similar to a while
	loop.

	There is still a statement, but the code in
	braces is executed once before the statement
	is checked.

	do{
		//do stuff at least once
	}while(statement);

	the statement has to be true for the code
	in the braces to be executed more than once.
*/

public class UsingDoWhileLoops {
	public static void main(String[] args) {
		//This is the most straight forward example I
		//can think of.
		do{
			System.out.println("I'm still gonna print. WATCH ME!");
		}while(false);
		
		boolean keepGoing = true;
		int count = 1;

		//gotta set keepGoing to false at some point
		do{
			System.out.println("Im in a do while loop");
			//when count is 5 (println should be called 5 times)
			if(count++ == 5){//tricky post increment here -> count is 6 after if check
				//set keepGoing to false
				keepGoing = false; //comment out after you google "how to kill infinite loop java"
			}
		}while(keepGoing);

		//count is 6
		System.out.println("I can still count backwards");
		do{
			System.out.println(--count);//pre decrement will set count to 5 before println
		}while(count > 0);
	}
}