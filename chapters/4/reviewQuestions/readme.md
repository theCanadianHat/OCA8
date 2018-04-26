# Chapter 4 Review Questions

### Q1. Which of the following can fill in the blank in this code to make it compile? (Choose all that apply)
```java
public class Ant{
	_______ void method() {}
}
```
- A. default
- B. final
- C. private
- D. Public
- E. String
- F. zzz:

### A1.


### Q2. Which of the following compile? (Choose all that apply)
- A. final static void method4() { }
- B. public final int void method() { }
- C. private void int method() { }
- D. static final void method3() { }
- E. void final method() { }
- F. void public method() { }

### A2.


### Q3. Which of the following methods compile? (Choose all that apply)
- A. public void methodA() { return; }
- B. public void methodB() { return null; }
- C. public void methodD() { }
- D. public int methodD() { return 9; }
- E. public int methodE() { return 9.0; }
- F. public int methodF() { }
- G. public int methodG() { return null; }

### A3.


### Q4. Which of the following compile? (Choose all that apply)
- A. public void moreA(int... nums) { }
- B. public void moreB(String values, int... nums) { }
- C. public void moreC(int... nums, String values) { }
- D. public void moreD(String... values, int... nums) { }
- E. public void moreE(String[] values, ...int nums) { }
- F. public void moreF(String... values, int[] nums) { }
- G. public void moreG(String[] values, int[] nums) { }


### A4.


### Q5. Given the following method, which of the method calls return 2? (Choose all that apply)
```java
public int howMany(boolean b, boolean... b2){
	return b2.length;
}
```
- A. howMany();
- B. howMany(true);
- C. howMany(true, true);
- D. howMany(true, true, true);
- E. howMany(true, {true});
- F. howMany(true, {true, true});
- G. howMany(true, new boolean[2]);

### A5.


### Q6. Which of the following are true? (Choose all that apply)
- A. Package private access is more lenient than protected access.
- B. A `public` class that has private fields and package private methods is not visible to classes outside the package.
- C. You can use access modifiers so only some of the classes in a package see a particular package private class.
- D. You can use access modifiers to allow read access to all methods, but not any instance variables.
- E. You can use access modifiers to restrict read access to all classes that begin with the word Test.

### A6.


### Q7. Given the following `my.school.Classroom` and `my.city.School` class definitions, which line number in `main()` generate a compiler error? (Choose all that apply)
```java
1: 	package my.school;
2:	public class Classroom{
3:		private int roomNumber;
4:		protected String teacherName;
5:		static int globalKey = 54321;
6:		public int floor = 3;
7:		Classroom(int r, String t){
8:			roomNumber = r;
9:			teacherName = t; } }

1:	package my.city;
2:	import my.school;
3:	public class School{
4:		public static void main(String[] args){
5:			System.out.println(Classroom.globalKey);
6:			Classroom room = new Classroom(101, "Mrs. Anderson")
7:			System.out.println(room.roomNumber);
8:			System.out.println(room.floor);
9:	    System.out.println(room.teacherRoom); } }
```
- A. None, the code compiles fine.
- B. Line 5
- C. Line 6
- D. Line 7
- E. Line 8
- F. Line 9

### A7.


### Q8. Which of the following are true? (Choose all that apply)
- A. Encapsulation uses package private instance variables.
- B. Encapsulation uses private instance variables.
- C. Encapsulation allows setters.
- D. Immutability uses package private instance variables.
- E. Immutability uses private instance variables.
- F. Immutability allows setters.

### A8.


### Q9. Which are methods using JavaBeans naming conventions for accessors and mutators? (Choose all that apply)
- A. `public boolean getCanSwim() { return canSwim;}`
- B. `public boolean canSwim() { return numberWings;}`
- C. `public int getNumWings() { return numberWings;}`
- D. `public int numWings() { return numberWings;}`
- E. `public void setCanSwim(boolean b) {canSwim = b;}`

### A9.


### Q10. What is the output of the following code?
```java
1:	package rope;
2:	public class Rope {
3:		public static int LENGTH = 5;
4:		static {
5:			LENGTH = 10;
6:		}
7:		public static void swing() {
8:			System.out.println("swing ");
9:	}
10:	}

1:	import rope.*;
2:	import static rope.Rope.*;
3:	public class Chimp {
4:		public static void main(String[] args){
5:			Rope.swing();
6:			new Rope().swing();
7:			System.out.println(LENGTH);
8:		}
9:	}
```
- A. swing swing 5
- B. swing swing 15
- C. Compiler error on line 2 of Chimp
- D. Compiler error on line 5 of Chimp
- E. Compiler error on line 6 of Chimp
- F. Compiler error on line 7 of Chimp

### A10.


### Q11. Which are true of the following code? (Choose all that apply)
```java
1:  public class Rope {
2:  	public static void swing() {
3:  		System.out.print("swing ")
4:  	}
5:  	public void climb() {
6:  		System.out.println("climb ")
7:  	}
8:		public static void play() {
9:			swing();
10:			climb();
11:		}
12:		public static void main(String[] args){
13:			Rope rope = new Rope();
14:			rope.play();
15:			Rope rope2 = null;
16:			rope2.play();
17:		}
18:	}
```
- A. The code compiles as is.
- B. There is exactly one compiler error in the code.
- C. There are exactly two compiler errors in the code.
- D. If the lines with compiler errors are removed, the output is `climb climb `.
- E. If the lines with compiler errors are removed, the output is `climb climb `.
- F. If the lines with compiler errors are removed, the code throws a `NullPointerException`.

### A11.


### Q12. What is the output of the following code?
```java
import rope.*;
import static rope.Rope.*;
public class RopeSwing {
	private static Rope rope1 = new Rope();
	private static Rope rope2= new Rope();
	{
		System.out.println(rope1.length);
	}
	public static void main(String[] args) {
		rope1.length = 2;
		rope2.length = 8;
		System.out.println(rope1.length);
	}
}

package rope;
public class Rope {
	public static int length = 0;
}
```
- A. 02
- B. 08
- C. 2
- D. 8
- E. The code does not compile.
- F. An exception is thrown.

### A12.


### Q13. How many compiler errors are in the following code?
```java
1:	public class RopeSwing {
2:		private static final String leftRope;	
3:		private static final String rightRope;	
4:		private static final String bench;	
5:		private static final String name = "name";	
6:		static {
7:			leftRope = "left";
8:			rightRope = "right";
9:		}
10:		static {
11:			name = "name";
12:			rightRope = "right"
13:		}
14:		public static void main(String[] args) {
15:			bench = "bench";
16:		}
17:	}
```
- A. 0
- B. 1
- C. 2
- D. 3
- E. 4
- F. 5

### A13.


### Q14. Which of the following can replace line 2 to make the code compile? (Choose all that apply)
```java
1:	import java.util.*;
2:	// INSERT CODE HERE
3:	public class Imports {
4:		public void method(ArrayList<String> list){
5:			sort(list);
6:		}	
7:	}
```
- A. import static java.util.Collections;
- B. import static java.util.Collections.*;
- C. import static java.util.Collections.sort(ArrayList<String>);
- D. static import java.util.Collections;
- E. static import java.util.Collections.*;
- F. static import java.util.Collections.sort(ArrayList<String>);

### A14.


### Q15. What is the result of the following statements?
```java
1:	public class Test {
2:		public void print(byte x) {
3:			System.out.print("byte");	
4:		}
5:		public void print(int x) {
6:			System.out.print("int");
7:		}
8:		public void print(float x) {
9:			System.out.print("float");
10:		}
11:		public void print(Object x) {
12:			System.out.print("Object");
13:		}
14:		public static void main(String[] args) {
15:			Test t = new Test();
16:			short s = 123;
17:			t.print(s);
18:			t.print(true);
19:			t.print(6.789);
20:		}
21:	}
```
- A. bytefloatObject
- B. intfloatObject
- C. byteObjectfloat
- D. intObjectfloat
- E. intObjectObject
- F. byteObjectObject

### A15.


### Q16. What is the result of the following program?
```java
1:	public class Squares {
2:		public static long square(int x) {
3:			long y = x * (long) x;
4:			x = -1;
5:			return y;
6:		}
7:		public static void main(String[] args) {
8:			int value = 9;
9:			long result = square(value);
10:			System.out.println(value);
11:	} }
```
- A. -1
- B. 9
- C. 81
- D. Compiler error on line 9.
- E. Compiler error on a different line.

### A16.


### Q17. Which of the following are output by the following code? (Choose all that apply)
```java
public class StringBuilders {
	public static StringBuilder work(StringBuilder a, StringBuilder b) {
		a = new StringBuilder("a");
		b.append("b");
		return a;
	}
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("s1");
		StringBuilder s2 = new StringBuilder("s2");
		StringBuilder s3 = work(s1, s2)
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
	}
}
```
- A. s1 = a
- B. s1 = s1
- C. s2 = s2
- D. s2 = s2b
- E. s3 = a
- F. s3 = null
- G. The code does not compile.

### A17.


### Q18. Which of the following are true? (Choose 2)
- A. `this()` can be called from anywhere is a constructor.
- B. `this()` can be called from any instance method in a class.
- C. `this.variableName` can be called from any instance method in the class.
- D. `this.variableName` can be called from any static method in the class.
- E. You must include a default constructor in the code if the compiler does not include one.
- F. You can call the default constructor written by the compiler using `this()`.
- G. You can access a private constructor with the `main()` method.

### A18.


### Q19. Which of these class compile and use a default constructor? (Choos all that apply)
- A. `public class Bird { }`
- B. `public class Bird { public bird() {} }`
- C. `public class Bird { public bird(String name) {} }`
- D. `public class Bird { public Bird() {} }`
- E. `public class Bird { public Bird(String name) {} }`
- F. `public class Bird { private Bird(int age) {} }`
- G. `public class Bird { void Bird() { } }`

### A19.


### Q20. What code can be inserted to have the code print 2?
```java
public class BirdSeed {
	private int numberBags;
	boolean call;

	public BirdSeed() {
		//LINE 1
		call = false;
		//LINE 2
	}
	public BirdSeed(int numberBags) {
		this.numberBags = numberBags;
	}
	public static void main(String[] args){
		BirdSeed seed = new BirdSeed();
		System.out.println(seed.numberBags)
	} }
```
- A. Replace line 1 with `BirdSeed(2);`
- B. Replace line 2 with `BirdSeed(2);`
- C. Replace line 1 with `new BirdSeed(2);`
- D. Replace line 2 with `new BirdSeed(2);`
- E. Replace line 1 with `this(2);`
- F. Replace line 2 with `this(2);`

### A20.
D. The code does not compile because `list` is instantiated using generics. Only `String` objects can be added to `list` and 7 is an `int`.

### Q21. What is the result of the following statements?
```java
3:  ArrayList<Integer> values = new ArrayList<String>();
4:  values.add(4);
5:  values.add(5);
6:  values.set(1, 6);
7:  values.remove(0);
8:  for (Integer v: values) System.out.print(v);
```
- A. 4
- B. 5
- C. 6
- D. 46
- E. 45
- F. An exception is thrown.
- G. The code does not compile.

### A21.
C. After line 4, `values` has one element (4). After line 5, `values` has two elements (4, 5). After line 6, `values` has two elements (4, 6) becasue `set()` does a replace. After line 7, `values` has only one element (6).

### Q22. What is the result of the following?
```java
int[] random = { 6, -4, 12, 0 , -10};
int x = 12;
int y = Arrays.binarySearch(random, x);
System.out.println(y);
```
- A. 2
- B. 4
- C. 6
- D. The result is undefined.
- E. An exception is thrown.
- F. The code does not compile.

### A22.
D. The code compiles and runs fine. However, an array must be sorted for `binarySearch()` to return a meaningful result.

### Q23. What is the result of the following?
```java
4:  List<Integer> list = Arrays.asList(10, 4, -1, 5);
5:  Collections.sort(list);
6:  Integer array[] = list.toArray(new Integer[4]);
7:  System.out.println(array[0]);
```
- A. -1
- B. 10
- C. Compiler error on line 4.
- D. Compiler error on line 5.
- E. Compiler error on line 6.
- F. An exception is thrown.

### A23.
A. Line 4 creates a fixed size array of size 4. Line 5 sorts it. Line 6 converts it back to an array. The brackets aren't in the traditional place, but they are still legal. Line 7 prints the first element, which is now -1.

### Q24. What is the result of the following?
```java
6:  String [] names = {"Tom", "Dick", "Harry"};
7:  List<String> list = names.asList();
8:  list.set(0, "Sue");
9:  System.out.println(names[0]);
```
- A. Sue
- B. Tom
- C. Compiler error on line 7.
- D. Compiler error on line 8.
- E. An exception is thrown.

### A24.
C. Converting from an array to an `ArrayList` uses `Arrays.asList(names)`. There is no `asList()` method on an array instance. If this code were corrected to compile, the answer would be option A.

### Q25. What is the result of the following?
```java
List<String> hex = Arrays.asList("30", "8", "3A", "FF");
Collections.sort(hex);
int x = Collections.binarySearch(hex "8");
int y = Collections.binarySearch(hex "3A");
int z = Collections.binarySearch(hex "4F");
System.out.println(x + " " + y + " " + z);
```
- A. 0 1 -2
- B. 0 1 -3
- C. 2 1 -2
- D. 2 1 -3
- E. None of the above.
- F. The code doesn't compile.

### A25.
D. After sorting, `hex` conatins `[30, 3A, 8, FF]`. Remember that numbers sort before letters and strings sort alphabetically. This makes 30 come before 8. A binary search correctly finds 8 at index 2 and 3A at index 1. It cannot find 4F but notices it should be at index 2. The rule when in item isn't found is to negate that index and subtract 1. Therefore we get -2-1, which is -3.

### Q26. Which of the following are true statements about the following code? (Choose all that apply)
```java
4:  List<Integer> ages = new ArrayList<>();
5:  ages.add(Integer.parseInt("5"));
6:  ages.add(Integer.valueOf("6"));
7:  ages.add(7);
8:  ages.add(null);
9:  for (int age: ages) System.out.print(age);
```
- A. The code compiles.
- B. The code throws a runtime exception.
- C. Exactly one of the add statements uses autoboxing.
- D. Exactly two of the add statements use autoboxing.
- E. Exactly thress of the add statements use autoboxing.

### A26.
A, B, D. Lines 5 and 7 use autoboxing to convert an `int` to an `Integer`. Line 6 does not because `valueOf()` returns an `Integer`. Line 8 does not because `null` is not an `int`. The code does compile. However, when the for loop tries to unbox `null` into an `int`, it fails and throws a `NullPointerException`.

### Q27. What is the result of the following?
```java
List<String> one = new ArrayList<String>();
one.add("abc");
List<String> two = new ArrayList<>();
two.add("abc");
if(one == two)
  System.out.println("A");
else if (one.equals(two))
  System.out.println("B");
else
  System.out.println("C");
```
- A. A
- B. B
- C. C
- D. An exception is thrown.
- E. The code does not compile.

### A27.
B. The first `if` statement is `false` becasue the variables do not point to the same object. The second `if` statement is `true` becasue `ArrayList` implements equality to mean the same elements in the same order.

### Q28. Which of the following can be inserted into the blank to create a date of June 21, 2014? (Choose all that apply)
```java
import java.time.*;

public class StartOfSummer {

  public static void main(String[] args) {
    LocalDate date = ____________________
  }
  
}
```
- A. `new LocalDate(2014, 5, 21);`
- B. `new LocalDate(2014, 6, 21);`
- C. `LocalDate.of(2014, 5, 21);`
- D. `LocalDate.of(2014, 6, 21);`
- E. `LocalDate.of(2014, Calendar.JUNE, 21);`
- F. `LocalDate.of(2014, Month.JUNE, 21);`

### A28.
D, F. Options A and B are incorrect because `LocalDate` does not have a public constructor. Option C is incorrect because months start counting with 1 rather than 0. Option E is incorrect because it uses the old pre-Java 8 way of counting months, again beginning at 0. Options D and F are both correct ways of specifying the desired date.

### Q29. What is the output of the following code?
```java
LocalDate date = LocaleDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
date.plusDays(2);
date.plusHours(3);
System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
```
- A. 2018 APRIL 2
- B. 2018 APRIL 30
- C. 2018 MAY 2
- D. Another date.
- E. The code does not compile.
- F. A runtime exception is thrown.

### A29.
D. A `LocalDate` does not have a time element. Therefore, it has no method to add hours and the code does not compile.

### Q30. What is the output of the following code?
```java
LocalDate date = LocaleDate.of(2018, Month.APRIL, 40);
System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
```
- A. 2018 APRIL 4
- B. 2018 APRIL 30
- C. 2018 MAY 10
- D. Another date.
- E. The code does not compile.
- F. A runtime exception is thrown.

### A30.
F. Java throws an exception if invalid date values are passed. There is not 40th day in April -- or any other month for that matter.

### Q31. What is the output of the following code?
```java
LocalDate date = LocaleDate.of(2018, Month.APRIL, 30);
date.plusDays(2);
date.plusYears(3);
System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
```
- A. 2018 APRIL 2
- B. 2018 APRIL 30
- C. 2018 MAY 2
- D. 2021 APRIL 2
- E. 2021 APRIL 30
- F. 2021 MAY 2
- G. A runtime exception is thrown.

### A31.
B. The date starts out as April 30, 2018. Since dates are immutable and the plus methods have their return values ignored, the result is unchanged. Therefore, option B is correct.

### Q32. What is the output of the following code?
```java
LocalDateTime d = LocaleDateTime.of(2015, 5, 10, 11, 22, 33);
Period p = Period.of(1, 2, 3);
d = d.minus(p);
DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
System.out.println(d.format(f));
```
- A. 3/7/14 11:22 AM
- B. 5/10/15 11:22 AM
- C. 3/7/14
- D. 5/10/15
- E. 11:22 AM
- F. The code does not compile.
- G. A runtime exception is thrown.

### A32.
E. Even though `d` have both date and time, the formmatter only outputs time.

### Q33. What is the output of the following code?
```java
LocalDateTime d = LocaleDateTime.of(2015, 5, 10, 11, 22, 33);
Period p = Period.ofDays(1).ofYears(2);
d = d.minus(p);
DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
System.out.println(d.format(f));
```
- A. 5/9/13 11:22 AM
- B. 5/10/13 11:22 AM
- C. 5/9/14
- D. 5/10/14
- E. 11:22 AM
- F. The code does not compile.
- G. A runtime exception is thrown.

### A33.
B. `Period` does not allow chaining. Only the last `Period` method called counts, so only the two years are subtracted.
