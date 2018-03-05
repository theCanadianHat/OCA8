package njh.c1.variables.references.classStructure;
/*
	This class has one field and two methods.
	Fields are data, and methods are ways to
	interact with the data.
*/
public class MethodsAndFields {
	//A variable (field) of type String named field
	String field;
	
	//A method that returns the field variable
	public String getField() {
		return field;
	}

	/*
		A method that doesn't return anything
		This method takes a single parameter of 
		type String.
		This method sets the field variable to the
		value of the parameter passed to it.
	*/
	public void setField(String field){
		this.field = field;
	}
}