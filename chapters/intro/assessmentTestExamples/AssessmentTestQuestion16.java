public interface Animal {
	public default String getName() { return null; } 
}
interface Mammal {
	public default String getName() { return null; }
}
abstract class Otter implements Mammal, Animal {}
/*
Compilation Fails:
------------------
Animal.java:7: error: class Otter inherits unrelated defaults for getName() from types Mammal and Animal
abstract class Otter implements Mammal, Animal {}
         ^
1 error
*/