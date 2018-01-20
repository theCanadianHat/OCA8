//Q12
public class Egret {
	private String color;
	public Egret() {
		this("white");
	}
	public Egret(String color) {
		color = color;	
	}
	public static void main(String[] args){
		Egret e = new Egret();
		System.out.println("Color:" + e.color);	
	}
}
/*
Output:
-------
Color:null
*/