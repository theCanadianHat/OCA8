//Q15
public interface CanSwim {}
public class Amphibian implements CanSwim {}
class Tadpole extends Amphibian {}
public class FindAllTadPole {
	public static void main(String[] args) {
		List<Tadpole> tadpoles = new ArrayList<Tadpole>();
		for(Amphibian amphibian : tadpoles) {
			//Original code commented out so I can test it.	
			//_________ tadpole = amphibian;

		} 
	} 
}