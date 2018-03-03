package njh.c4.lambdas;

/*
	We want to filter out Bears on matching different fields.
	We don't want to create multiple custom implementations
	of CheckBear to do this.

	Leveraging the Java provided interface Predicate we will
	be able to use lambdas to acheive our goal.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UsingLambdas{
	
	public static void main(String[] args) {
		Bear b1 = new Bear("Brown", true, false);
		Bear b2 = new Bear("Black", false, false);

		List<Bear> bears = new ArrayList<>();
		bears.add(b1);
		bears.add(b2);
		bears.add(new Bear("White", true, true));

		//here it is, the illusive lambda
		System.out.println("Bears that are hungry:");
		print(bears, b -> b.isHungry());
		//print(bears, Bear b -> b.isHungry()); //won't compile
		//print(bears, b -> { b.isHungry() }); 	//won't compile
		//print(bears, b -> { b.isHungry(); });	//won't compile

		/*
			These are the same as above:
			(Bear b) -> { return b.isHungry(); }
			b -> { return b.isHungry(); }
			(Bear b) -> b.isHungry()

			Lambda Syntax:
			parameter list|	arrow|	body
			b             |	->   |	b.isHungry()

			() are optional for a single parameter. If
			you choose to use the type of the parameter, parentheses
			are required. If you have more than one parameters parentheses
			are required

			The -> splits the parameters list from the body of the lambda

			{} are option with a single statement. Java doesn't require you
			to use a return or semicolon when you omit the braces. If more
			than one statement is present braces are required; so are semicolons
			and a return statement.
		*/

		/*
			Whats the benefit???
			
			If I want filter on any field of Bear, I can!
			I HAVE THE POWER!
		*/
			System.out.println("Bears that are old:");
			print(bears, b -> b.isOld());
			System.out.println("Bears that are black:");
			print(bears, b -> "Black".equals(b.getColor()));
	}

	/*
		Predicate is a generic, but so is List. The second parameter is a 
		functional interface, like CheckBear, and we want to use Bear as
		the data to check on.
	*/
	private static void print(List<Bear> bears, Predicate<Bear> pb){
		for(Bear b : bears){
			if(pb.test(b)){ // calling Predicate test
				System.out.println(b);
			}
		}
	}
}