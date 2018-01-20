//Q6
public class MathFunctions {
	public static void addToInt(int x, int amountToAdd){
		x = x + amountToAdd;
	}
	public static void main(String[] args){
		int a = 15;
		int b = 10;
		MathFunctions.addToInt(a, b);
		System.out.println(a); 
	}
}	
/*
Output:
-------
15
*/