package njh.c4.encapsulation;

public class EncapsulatedClass{
	
	/*
		The member fields of this class are private.
		No classes can access these fields directly.
	*/
	private int a;
	private int b;

	/*
		Public getters/accessors are used to retrieve
		the value of the private member fields.
	*/
	public int getB() { return this.b; }
	public int getA() { return a; }

	/*
		Public setters/mutators are used to change the
		value of the private member fields.
	*/
	public void setA(int a){ this.a = a; }
	public void setB(int b) { this.b = b; }

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("EncapsulatedClass {\n");
		sb.append("\ta = " + this.a + "\n");
		sb.append("\tb = " + this.b + "\n");
		return sb.toString();
	}
}