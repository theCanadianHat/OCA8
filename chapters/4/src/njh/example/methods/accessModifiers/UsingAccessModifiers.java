package njh.example.methods.accessModifiers;

public class UsingAccessModifiers{
	public static void main(String[] args){
		AccessModifiers am = new AccessModifiers(1, 2, 3, 4);
		//System.out.println(am.a); //won't compile
		System.out.println(am.b);
		System.out.println(am.c);
		//System.out.println(am.d); //won't compile
	}
}