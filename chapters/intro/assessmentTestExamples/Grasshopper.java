//Q10
import java.util.*;
public class Grasshopper {
	public Grasshopper(String n){
		name = n;
	}
	public static void main(String[] args){
		Grasshopper one = new Grasshopper("g1");
		Grasshopper two = new Grasshopper("g2");
		one = two;
		two = null;
		one = null;
	}
	private String name; 
}
/*
No output.
*/