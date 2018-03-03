package njh.c4.lambdas;

import java.util.ArrayList;
import java.util.List;
/*
	To figure out why we would want to use lambdas,
	we should first look at a situation where they are useful.

	Say we want to filter out some data based off of different data
	points. CheckBear is an interface that has a single method called test.
	CheckBearHunger is an implementation of CheckBear that checks to see 
	if the bear is hungry.
*/
public class NotUsingLambdas{
	public static void main(String[] args) {
		Bear b1 = new Bear("Brown", true, false);
		Bear b2 = new Bear("Black", false, false);

		List<Bear> bears = new ArrayList<>();
		bears.add(b1);
		bears.add(b2);
		bears.add(new Bear("White", true, true));

		print(bears, new CheckBearHunger()); //pass the implementation you want
		/*
			If we wanted to filter Bears on a different field we would have to 
			write another implementation of CheckBear.
			This situation can be handled with lambdas, and you wont have to write
			any custom implementation.
		*/
	}

	private static void print(List<Bear> bears, CheckBear cb){
		for(Bear b : bears){
			if(cb.test(b)){ //calls general test
				System.out.println(b);
			}
		}
	}
}