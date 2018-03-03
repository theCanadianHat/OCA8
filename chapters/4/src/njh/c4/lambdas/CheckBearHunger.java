package njh.c4.lambdas;

public class CheckBearHunger implements CheckBear{
	boolean test(Bear bear) {
		return bear.isHungry();
	}
}