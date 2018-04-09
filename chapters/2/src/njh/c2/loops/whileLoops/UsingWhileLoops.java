package njh.c2.loops.whileLoops;

/*
	A while loop will execute and continue
	to execute as long as the statement in 
	the parentheses is true

	while(statement){
		//do stuff
	}

	the statement has to be true for the code
	in the braces to be executed.

	infinite loop
	while(true){}
	
	watch out for infinite loops 
*/

public class UsingWhileLoops {
	public static void main(String[] args) {
		boolean keepGoing = true;
		int count = 1;

		//gotta set keepGoing to false at some point
		while(keepGoing){
			System.out.println("Im in a while loop");
			//when count is 5 (println should be called 5 times)
			if(count++ == 5){//tricky post increment here -> count is 6 after if check
				//set keepGoing to false
				keepGoing = false; //comment out after you google "how to kill infinite loop java"
			}
		}

		//count is 6
		System.out.println("I can count backwards");
		while(count > 0){
			System.out.println(--count);//pre decrement will set count to 5 before println
		}
	}
}