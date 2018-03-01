package njh.c4.methods;

public class MyClass {
	String name;
	int number;

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("MyClass: {\n")
		.append("\tname: " + this.name + "\n")
		.append("\tnumber: " + this.number + "\n")
		.append("}\n");
		return sb.toString();
	}
}