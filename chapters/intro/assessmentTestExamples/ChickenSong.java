//Q13
/*
If I want to be able to run this code I will have to implement
HenHouse.

Usage: java ChickenHouse <1-4 depending on which implementation of HenHouse you want>
*/
class Chicken {}
interface HenHouse { public java.util.List<Chicken> getChickens(); }
public class ChickenSong {
	public static void main(String[] args){
		//Not part of the question -- BEGIN
		int input = 0;
		if(args.length < 1 || args.length > 1){
			System.out.println("Usage: Provide a SINGLE number 1-4 as input");
			System.exit(1);
		}else{
			input = Integer.parseInt(args[0]);				
		}
		HenHouse house = null;
		switch(input){
			case 1:
				house = new HenHouseImpl1();
				break;
			case 2:
				house = new HenHouseImpl2();
				break;
			case 3:
				house = new HenHouseImpl3();
				break;
			case 4:
				house = new HenHouseImpl4();
				break;
			default:
				System.out.println("Usage: Provide a SINGLE number 1-4 as input");
				System.exit(1);
				break;
		}
		//Not part of the question -- END

		//Original code commented out so I can test it.
		//HenHouse house = ________________
		Chicken chicken = house.getChickens().get(0);
		for(int i=0; i<house.getChickens().size();
		chicken = house.getChickens().get(i++)){
			System.out.println("Cluck");
		} 
	} 
}
//Not part of the question -- BEGIN
class HenHouseImpl1 implements HenHouse {
	@Override
	public java.util.List<Chicken> getChickens(){
		java.util.List<Chicken> c = new java.util.ArrayList<>();
		c.add(new Chicken());
		c.add(new Chicken());
		c.add(new Chicken());
		return c;
	}
}
/*
Output:
-------
Cluck
Cluck
Cluck
*/

class HenHouseImpl2 implements HenHouse {
	@Override
	public java.util.List<Chicken> getChickens(){
		java.util.List<Chicken> c = new java.util.ArrayList<>();
		c.add(new Chicken());
		return c;
	}
}
/*
Output:
-------
Cluck
*/

class HenHouseImpl3 implements HenHouse {
	@Override
	public java.util.List<Chicken> getChickens(){
		java.util.List<Chicken> c = new java.util.ArrayList<>();
		return c;
	}
}
/*
Runtime Exception:
------------------
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        at java.util.ArrayList.rangeCheck(Unknown Source)
        at java.util.ArrayList.get(Unknown Source)
        at ChickenSong.main(ChickenSong.java:41)
*/

class HenHouseImpl4 implements HenHouse {
	@Override
	public java.util.List<Chicken> getChickens(){
		return null;
	}
}
/*
RuntimeExcpetion:
------------------
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        at java.util.ArrayList.rangeCheck(Unknown Source)
        at java.util.ArrayList.get(Unknown Source)
        at ChickenSong.main(ChickenSong.java:41)
*/
//Not part of the question -- END