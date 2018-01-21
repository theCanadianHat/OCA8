# Assessment Test Questions
### Q1. Which is the result of the following class? (Choose all that apply)
```java
1:	public class _C{
2: 		private static int $;
3:		public static void main(String[] main){
4:			String a_b;
5:			System.out.print($);
6:			System.out.print(a_b);
7:	} }
```

- A. Compiler error on line 1.
- B. Compiler error on line 2.
- C. Compiler error on line 4.
- D. Compiler error on line 5.
- E. Compiler error on line 6.
- F. 0null
- G. nullnull

### A1. 
E. Option E is correct because local variables require assignment before referencing them. Option D is incorrect because class and instance variables have default values and allow referencing. `a_b` defaults to a `null` value. Options A, B, and C are incorrect because identifiers may begin with letter, underscore, or dollar sign. Options F and G are incorrect because that code does not compile. If `a_b` was an instance variable, the code would compile and output `0null`. For more information, see Chapter 1

### Q2. What is the result of the following code?
```java
String s1 = "Java";
String s2 = "Java";
StringBuilder sb1 = new StringBuilder();
sb1.append("Ja").append("va");
System.out.println(s1 == s2);
System.out.println(s1.equals(s2);
System.out.println(sb1.toString() == s1);
System.out.println(sb1.toString().equals(s2);
```
- A. ```true``` is printed out exactly once.
- B. `true` is printed out exactly twice.
- C. `true` is printed out exactly three times.
- D. `true` is printed out exactly four times.
- E. The code does not compile.

### A2. 
C. String literals are used from the string pool. This means that `s1` and `s2` refer to the same object and are equal. Therefore, the first two print statements print `true`. The third print statement prints `false` because `toString()` uses a method to compute the value and it is not from the string pool. The final print statement again prints `true` because `equals()` looks at the values of `String` objects. For more information, see Chapter 3.

### Q3. What is the output of the following code? (Choose all that apply)
```java
1:	interface HasTail { int getTailLength(); }
2:	abstract class Puma implements HasTail {
3:		protected int getTailLength() { return 4; }
4:	}
5:	public class Cougar extends Puma {
6:		public static void main(String[] args){
7:			Puma puma = new Puma();
8:				System.out.println(puma.getTailLength());
9:		}
10:		
11:	public int getTailLength(int length) { return 2; }
12:	}
```
- A. 2
- B. 3
- C. The code will not compile because of line 3.
- D. The code will not compile because of line 5.
- E. The code will not compile because of line 7.
- F. The code will not compile because of line 11.
- G. The output cannot be determined from the code provided.

### A3.
C, D, E. First, the method `getTailLength()` in the interface `HasTail` is assumed to be public, since it is part of an interface. The implementation of the method on line 3 is therefore an invalid override, as `protected` is more restrictive access modifier than `public`, so options C is correct. Next, the class `Cougar` implements and overloaded version of `getTailLength()`, but since the declaration in the parent class `Cougar` is invalid, it needs to implement a public version of the method. Since it does not, the declaration of `Cougar` is invalid, so option D is correct. Option E is correct, since `Puma` is marked `abstract` and cannot be instantiated. The overloaded method on line 11 is declared correctly, so option F is not correct. Finally, as the code has multiple compiler errors, options A, B, and G can be eliminated. For more information, see Chapter 5.

### Q4. What is the output of the following program?
```java
1:	public class FeedingSchedule {
2:		public static void main(String[] args){
3:			boolean keepGoing = true;
4:			int count = 0;
5:			int x = 3;
6:			while(count++ < 3){
7:				int y = (1 + 2 * count) % 3;
8:					switch(y){
9:						default:
10:						case 0: x -= 1; break;
11:						case 1: x += 5;
12:					}	
13:				}
14:			System.out.println(x);	
15:	} }
```
- A. 4
- B. 5
- C. 6
- D. 7
- E. 13
- F. The code will not compile because of line 7.

### A4.
C. The code compiles and runs without issue; therefore, option F is incorrect. This type of problem is best examined one loop iteration at a time:
- The loop stats as `count` loop expression evaluates to `0 < 3`, which is `true`, With count taking a new value of `1`. The value of y is set to:
	- y = (1 + 2 * 1) % 3
	- y = (1 + 2) % 3
	- y = 3 % 3
	- y = 0
- The first case block is called and the value of `x` is then set to:
	- x = 3 - 1 = 2
- The loop continues as `count` loop expression evaluates to `1 < 3`, which is `true`, with `y` taking a new value of 2. The value of `y` is set to:
	- y = (1 + 2 * 2) % 3
	- y = (1 + 4) % 3
	- y = 5 % 3
	- y = 2
- The `default` block is called and the value of `x` is set to:
	- x = 2 - 1 = 1
- The loop continues as the `count` loop expression evaluates to `2 < 3`, which is `true`, with `y` taking a new value of 3. The value of `y` is set to:
	- y = (1 + 2 * 3) % 3
	- y = (1 + 6) % 3
	- y = 7 % 3
	- y = 1
- The second case block is called and the value of `x` is then set to:
	- x = 1 + 5 = 6
- The loop ends as the `count` loop expression evaluates to `3 < 3`, with `y` also taking a new value of 4. The most recent value of `x`, 6, is output, so the answer is option C. For more information, see Chapter 2.

### Q5. What is the output of the following code snippet?
```java
13:	System.out.print("a");
14:	try{
15:		System.out.print("b");
16:		throw new IllegalArgumentException();
17:	} catch (RuntimeException e){
18:		System.out.print("c");
19:	} finally {
20:		System.out.print("d");
21:	}
22:	System.out.print("e");
```
- A. abe
- B. abce
- C. abde
- D. abcde
- E. The code does not compile.
- F. An uncaught exception is thrown.

### A5.
D. The code stats running and prints `a` and `b` on lines 13 and 15. Line 16 throws an exception, which is caught on line 17. After line 18 prints `c`, the `finally` block is run and `d` is printed. Then the `try` statement ends and `e` is printed on line 22. For more information, see Chapter 2.

### Q6. What is the result of the following program?
```java
1:	public class MathFunctions {
2:		public static void addToInt(int x, int amountToAdd){
3:			x = x + amountToAdd;
4:		}
5:		public static void main(String[] args){
6:			int a = 15;
7:			int b = 10;
8:			MathFunctions.addToIn(a, b);
9:			System.out.println(a); }}
```
- A. 10
- B. 15
- C. 25
- D. Compiler error on line 3.
- E. Compiler error on line 8.
- F. None of the above

### A6.
B. The code compiles successfully, so options D and E are incorrect. The value of `a` cannot be changed be the `addToInt()` method, not matter what the method does, because only a copy of the variable is passed into the parameter `x`. Therefore. `a` does not change and the output on line 9 is 15. For more information, see Chapter 4.

### Q7. What is the result of the following code?
```java
int[] array = {6,9,8};
List<Integer> list = new ArrayList<>();
list.add(array[0]);
list.add(array[2]);
list.set(1, array[1]);
list.remove(0);
System.out.println(list);
```
- A. [8]
- B. [9]
- C. Something like [Ljava.land.String;@160bc7c0
- D. An exception is thrown.
- E. The code does not compile.

### A7.
B. The array is allowed to use an anonymous initializer because it is in the name line as the declaration. The `ArrayList` uses the diamond operator allowed since Java 7. This specifies the type matches the one on the left without having to re-type it. After adding the two  elements, `list` contains [6, 8]. We then replace the element at index 1 with 9, resulting in [6, 9]. Finally, we remove the element at index 0, leaving [9]. Option C is incorrect because arrays output something like that rather than an ArrayList. For more information, see Chapter 3.

### Q8. What is the output of the following code?
```java
1:	public class Deer{
2:		public Deer() { System.out.print("Deer"); }
3:		public Deer(int age) { System.out.print("DeerAge"); }
4:		private boolean hasHorns() { return false; }
5:		public static void main(String[] args){
6:			Deer deer = new Reindeer(5);
7:			System.out.println(","+deer.hasHorns());
8:		}
9:	}
10:	class Reindeer extends Deer {
11:		public Reindeer(int age) { System.out.print("Reindeer"); }
12:		public boolean hasHorns { return true; }
13:	}
```
- A. DeerReindeer,false
- B. DeerReindeer,true
- C. ReindeerDeer,false
- D. ReindeerDeer,true
- E. DeerAgeReindeer,false
- F. DeerAgeReindeer,true
- G. The code will not compile because of line 7.
- H. The code will not compile because of line 12.

### A8.
A. The code compiles and runs without issue, so options G an H are incorrect. First, the `Reindeer` object is instantiated using the constructor that takes an `int` value. Since there is not explicit call to the parent constructor, the default no-argument `super()` is inserted as the first line of the constructor. The output us the `Deer`, followed by `Reindeer` in the child constructor, so only options A and B can be correct. Next, the method `hasHorns()` looks like and overridden method, but it is actually a hidden method since it is declared private in the parent class. Because the hidden method is referenced in the parent class, the parent version is used, so the code outputs `false`, and option A is the correct answer.

### Q9. Which of the following statements are true? (Choose all that apply)
- A. Checked exceptions are intended to be thrown by the JVM (and not the programmer).
- B. Checked exceptions are required to be caught or declared.
- C. Errors are intended to be thrown by the JVM (and not the programmer).
- D. Errors are required to be caught or declared.
- E. Runtime exceptions are intended to be thrown by the JAM (and not the programmer).
- F. Runtime exceptions are required to be caught or declared.

### A9.
B, C. Only checked exceptions are required to be handled (caught) or declared. Runtime exceptions are commonly thrown by both the JVM and the programmer code. Checked exceptions are usually thrown by programmer code. Errors are intended to be thrown by the JVM. While a programmer could throw one, this would be a horrible practice. For more information, see Chapter 6.

### Q10. Which are true of the following code? (Choose all that apply)
```java
1:	import java.util.*;
2:	public class Grasshopper {
3:		public Grasshopper(String n){
4:			name = n;
5:		}
6:		public static void main(String[] args){
7:			Grasshopper one = new Grasshopper("g1");
8:			Grasshopper two = new Grasshopper("g2");
9:			one = two;
10:			two = null;
11:			one = null;
12:		}
13:		private String name; }
```
- A. Immediately after line 9, no grasshopper objects are eligible for garbage collection.
- B. Immediately after line 10, no grasshopper objects are eligible for garbage collection.
- C. Immediately after line 9, only one grasshopper object is eligible for garbage collection.
- D. Immediately after line 10, only one grasshopper object is eligible for garbage collection.
- E. Immediately after line 11, only one grasshopper object is eligible for garbage collection.
- F. The code compiles.
- G. The code does not compile.

### A10.
C, D, F. Immediately after line 9, only `Grasshopper g1` is eligible for garbage collection since `one` and `two` point to `Grasshopper g2`. Immediately after line 10, we still only have `Grasshopper g1` eligible for garbage collection. Reference `one` points to `g1` and reference `two` is `null`. Immediately after line 11, both `Grssshopper` objects are eligible foe garbage collection since both `one` and `two` point to `null`. The code does compile. Although it is traditional to declare instance variables early in the class, you don't have to. for more information, see Chapter 1.

### Q11. What is the output of the following program?
```java
1:	public class FeedingSchedule {
2:		public static void main(String[] args) {
3:			int x = 5, j = 0;
4:			OUTER: for(int i=0; i<3; )
5:				INNER: do {
6:					i++; x++;
7:					if(x > 10) break INNER;
8:					x += 4;
9:					j++;
10:				} while (j <= 2);
11:			System.out.println(x);
12:	}}
```
- A. 10
- B. 12
- C. 13
- D. 17
- E. The code will not compile because of line 4.
- F. The code will not compile because of line 6.

### A11.
B. The code compiles and runs without issue; therefore, options E and F are incorrect. This type of problem is best examined one loop iteration at a time:
- On the first iteration of the outer loop `i` is 0, so the loop continues.
- On the first iteration of the inner loop, `i` is updated to 1 and `x` to 6. The `if-then` statement branch is not executed, and `x` is increased to 10 and `j` to 1.
- On the second iteration of the inner loop ( since `j` = 1 and 1 <= 2), `i` is updated to 2 and `x` to 11. At this point, the `if-then` branch will evaluate to `true` for the remainder of the program run, which causes the flow to break out of the inner loop each time it is reached.
- On the second iteration of the outer loop (since `i` = 2), `i` is updated to 3 and `x` to 12. As before, the inner loop is broken since `x` is still greater than 10.
- On the third iteration of the outer loop, the outer loop is broken, as `i` is already not less than 3. The most recent value of `x`, 12, is output, so the answer is options B. For more information, see Chapter 2.

### Q12. What is the result of the following program?
```java
1:	public class Egret {
2:		private String color;
3:		public Egret() {
4:			this("white");
5:		}
6:		public Egret(String color) {
7:			color = color;	
8:		}
9:		public static void main(String[] args){
10:			Egret e = new Egret();
11:			System.out.println("Color:" + e.color);	
12:		}
13:	}
```
- A. Color:
- B. Color:null
- C. Color:White
- D. Compiler error on line 4.
- E. Compiler error on line 10.
- F. Compiler error on line 11.

### A12.
B. Line 10 calls the constructor on lines 3-5. That constructor calls the other constructor. However, the constructor on lines 6-8 assigns the method parameter to itself, which leaves the `color` instance variable on line 2 set to its default value of `null`. For more information, see Chapter 4.

### Q13. What is the output of the following program?
```java
1:	public class BearOrShark {
2:		public static void main(String[] args) {
3:			int luck = 10;
4:			if((luck>10 ? luck++: --luck)<10) {
5:				System.out.print("Bear");	
6:			} if(luck < 10) System.out.print("Shark");	
7:	} }
```
- A. Bear
- B. Shark
- C. BearShark
- D. The code will not compile because of line 4.
- E. The code will not compile because of line 6.
- F. The code compiles without issues but does not produce any output.

### A13.
C. The code compiles and runs without issue, so options D and E are incorrect. Remember that only one of the right-hand ternary expressions will be evaluated at runtime. Since `luck` is not less than 10, the second expression, `--luck`, will be evaluated, and since the pre-increment operator was used, the value returned will be 9, which is less than 10. So the first `if-then` statement will be cisited and `Bear` will be output. Notice there is no `else` statement on line 6. Since `luck` is still less than 10, the second `if-then` statement will also be reached and `Shark` will be output; therefore, the correct answer is option C. For more information, see Chapter 2.

### Q14. Assumming we have a valid, non-`null` `HenHouse` object whose value is initialized by the blank line show here, which of the following are possible outputs of this application? (Choose all that apply)
```java
1:	class Chicken {}
2:	interface HenHouse { public java.util.List<Chicken> getChickens(); }
3:	public class ChickenSong {
4:		public static void main(String[] args){
5:			HenHouse house = ________________
6:			Chicken chicken = house.getChickens().get(0);
7:			for(int i=0; i<house.getChickens.size();
8:				chicken = house.getChickens().get(i++)){
9:				System.out.println("Cluck");
10:	} } }
```
- A. The code will not compile because of line 6.
- B. The code will not compile because of lines 7-8.
- C. The application will compile but not produce any output.
- D. The application will output `Cluck` exactly once.
- E. The application will output `Cluck` more than once.
- F. The application will compile but produce an exception at runtime.

### A14.
D, E, F. The code compiles without issue, so options A and B are incorrect. If `house.getChickens()` returns an array of one element, the code will output `Cluck` once, so option D is correct. If `house.getChickens()` returns an array of multiple elements, the code will output `Cluck` once for each element in the array, so option E is correct. Alternatively, if `house.getChickens()` returns an array of zero elements, then the code will throw an `IndexOutOfBoundsException` on the call to `house.getChickens().get(0);` therefore, option C is not possible and option F is correct. The code will also throw an exception if the array returned by `house.getChickens()` is `null`, so option F is possible under multiple circumstances. For more information, see Chapter 2.

### Q15. Which of the following statements can be inserted in the blank line so that the code will compile successfully? (Choose all that apply)
```java
public interface CanSwim {}
public class Amphibian implements CanSwim {}
class Tadpole extends Amphibian {}
public class FindAllTadPole {
	public static void main(String[] args) {
		List<Tadpole> tadpoles = new ArrayList<Tadpole>();
		for(Amphibian amphibian : tadpoles) {
			_________ tadpole = amphibian;
} } }
```
- A. CanSwim
- B. Long
- C. Amphibian
- D. Tadpole
- E. Object

### A15.
A, C, E. The `for-each` loop automatically casts each `Tadpole` object to an `Amphibian` reference, which does not require an explicit cast because `Tadpole` is a subclass of `Amphibian`. From there, any parent class or interface that `Amphibian` inherits from is permitted without an explicit cast. This includes `CanSwim`, the interface `Amphibian` implements, and `Object`, which all classes extend from, so options A and E are correct. Option C is also correct since the reference is being cast to the same type, so no explicit cast is required. Option B is incorrect, since `Long` is not a parent of `Amphibian`. Option D is incorrect as well, although an explicit cast to `Tadpole` on the right-hand side of the expression would be required to allow the code to compile. For more information, see Chapter 5.

### Q16. What individual changes, if any, would allow the following code to compile? (Choose all that apply)
```java
1:	public interface Animal { public default String getName() { return null; } }
2:	interface Mammal { public default String getName() { return null; }}
3:	abstract class Otter implements Mammal, Animal {}
```
- A. The code compiles without issue.
- B. Remove the `default` method modifier and the method implementation on line 1.
- C. Remove the `default` method modifier and the method implementation on line 2.
- D. Remove the `default` method modifier and the method implementation on lines 1 and 2.
- E. Change the return value one line 1 from `null` to `"Animal"`.
- F. Override the `getName()` method with an `abstract` method in the `Otter` class.
- G. Override the `getName()` method with a concrete method in the `Otter` class.

### A16.
D, F, G. The code does not compile, since a class cannot inherit two interfaces that both define default methods with the same signature, unless the class implementing the interface overrides it with an abstract or concrete method. Therefore, option A is incorrect and options F and G are correct. The alternate approach is to make the `getName()` method abstract in the interfaces, because the class may inherit two abstract methods with the same signature. The change must be made to both interfaces, though, so options B and C are incorrect if taken individually, and option D is correct since the changes are taken together. For more information, see Chapter 5.

### Q17. Which of the following lines can be inserted at line 11 to print `true`? (Choose all that apply)
```java
10:	public static void main(String[] args) {
11:		//INSERT CODE HERE
12:	}
13:	private static boolean test(Predicate<Integer> p) {
14:		return p.test(5);
15:	}
```
- A. System.out.println(test(i -> i == 5));
- B. System.out.println(test(i -> {i == 5;}));
- C. System.out.println(test((i) -> i == 5));
- D. System.out.println(test((int i)  -> i == 5));
- E. System.out.println(test((int i) -> {return i == 5;}));
- F. System.out.println(test((i) -> {return i == 5;}))

### A17.
A, C, F. The only functional programming interface you need to memorize for the exam is `Predicate`. It takes a single parameter and returns a `boolean`. Lambda expressions with one parameter are allowed to omit the parentheses around the parameter list, making options A and C correct. The `return` statement is optional when a single statement is in the body, making option F correct. Option B is incorrect because a `return` statement must be used if braces are included around the body. Options D and E are incorrect because that type is `Integer` in the predicate and `int` in the lambda. Autoboxing works for collections not inferring predicates. If these two were changed to `Integer`, they would be correct. For more information, see Chapter 4.

### Q18. Which of the following print out a date representing April 1, 2015? (Choose all that apply)
- A. System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
- B. System.out.println(LocalDate.of(2015, Month.APRIL, 1));
- C. System.out.println(LocalDate.of(2015, 3, 1));
- D. System.out.println(LocalDate.of(2015, 4, 1));
- E. System.out.println(new LocalDate(2015, 3, 1));
- F. System.out.println(new LocalDate(2015, 4, 1));

### A18.
B, D. The new date APIs added in Java 8 use static methods rather than a constructor to create a new date, making options E and F incorrect. The months are indexed stating with 1 in these APIs, making options A and C incorrect. Option A uses the old `Calendar` constants which are indexed from 0. Therefore, options B and D are correct. For more information, see Chapter 6.

### Q19. Bytecode is in a file with which extension?
- A. .bytecode
- B. .bytes
- C. .class
- D. .exe
- E. .javac
- F. .java

### A19.
C. Files with the `.java` extension contain the Java source code and are compiled to files with the `.class` extension that contain bytecode. For more information, see Chapter 1.

### Q20. Which of the following are checked exceptions? (Choose all that apply)
- A. Exception
- B. IllegalArgumentException
- C. IOException
- D. NullPointerException
- E. NumberFormatException
- F. StackOverflowError

### A20.
A, C. Option A is the exception base class, which is a checked exception. Options B, D, and E extend `RuntimeException` directly or indirectly and therefore are unchecked exceptions. Option F is throwable and not an exception, and so should not be caught or declared. For more information, see Chapter 6.