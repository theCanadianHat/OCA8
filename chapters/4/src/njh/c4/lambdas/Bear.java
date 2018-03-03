package njh.c4.lambdas;

public class Bear {
	
	private String color;
	private boolean hungry;
	private boolean old;

	Bear(String color, boolean hungry, boolean old){
		this.color = color;
		this.hungry = hungry;
		this.old = old;
	}

	public String getColor() { return color; }
	public boolean isHungry() { return hungry; }
	public boolean isOld() { return old; }

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Bear {\n");
		sb.append("\tcolor = " + color + "\n");
		sb.append("\thungry = " + hungry + "\n");
		sb.append("\told = " + old + "\n");
		sb.append("}\n");
		return sb.toString();
	}
}