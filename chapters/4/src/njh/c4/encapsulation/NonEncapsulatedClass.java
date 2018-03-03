package njh.c4.encapsulation;

public class NonEncapsulatedClass{
	/*
		Since this class' members are public they
		can be access from anywhere. Any class can
		alter the data. There is no encapsulation.
		There is no protection.
	*/
	public int a;
	public int b;

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("NonEncapsulatedClass {\n");
		sb.append("\ta = " + this.a + "\n");
		sb.append("\tb = " + this.b + "\n");
		return sb.toString();
	}
}