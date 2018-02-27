package njh.c4.statics;

import static njh.c4.statics.UsingStaticInitalizers.x;
//import static njh.c4.statics.UsingStaticInitalizers; 
//won't compile must import static member
//static import njh.c4.statics.UsingStaticInitalizers.x; 
//won't compile wrong order import then static

public class UsingStaticImports {
	public static void main(String[] args){
		//can just use x since it is a static import
		System.out.println(x);
	}
}