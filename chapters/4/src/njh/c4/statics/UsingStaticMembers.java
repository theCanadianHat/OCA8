package njh.c4.statics;

public class UsingStaticMembers {
	public static int count = 0;
	public static String name = "Bear";

	public static void main(String[] args) {
		UsingStaticMembers.count = 5;
		UsingStaticMembers usm1 = new UsingStaticMembers();
		UsingStaticMembers usm2 = new UsingStaticMembers();
		usm1.count = 6;
		usm2.count = 7;
		System.out.println(UsingStaticMembers.count);
	}
}