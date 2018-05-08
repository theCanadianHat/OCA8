# Chapter 1 Review Questions
### Q1. Which of the following are valid Java identifier? (Choose all that apply)
- [X] A. A$B
- [X] B. \_helloworld
- [ ] C. true
- [ ] D. java.lang
- [X] E. Public
- [ ] F. 1980_s

### A1.
Option A is valid becasue you can use the dollar sign in identifiers. Option B is valid because you can use an underscore in identifiers. Option C is not a valid identifier because `true` is a Java reserved word. Option D is not valid because the dot (.) is not allowed in identifiers. Option E is valide because Java is case sensitive, so `Public` is not a reserved word an therefore a valid identifier. Option F is not valid because the first character is not a letter, $, or _.

### Q2. What is the output of the following program?
```java
1:  public class WaterBottle {
2:    private String brand;
3:    private boolean empty;
4:    public static void main(String[] args) {
5:      WaterBottle wb = new WaterBottle();
6:      System.out.println("Empty = " + wb.empty);
7:      System.out.println(", Brand = " + wb.brand);
8:  } }
```
- [ ] A. Line 6 generates a compiler error.
- [ ] B. Line 7 generates a compiler error.
- [ ] C. There is no output.
- [X] D. Empty = false, Brand = null
- [ ] E. Empty = false, Brand = 
- [ ] F. Empty = null, Brand = null

### A2.
Boolean fields initialize to `false` and references initialize to `null`, so `empty` is `false` and `brand` is `null`. `Brand = null` is output.

### Q3. Which of the following are true? (Choose all that apply)
``` java
4:  short numPets = 5;
5:  int numGrains = 5.6;
6:  String name = "Scruffy";
7:  numPets.length();
8:  numGrains.length();
9:  name.length();
```
- [ ] A. Line 4 generates a compiler error.
- [X] B. Line 5 generates a compiler error.
- [ ] C. Line 6 generates a compiler error.
- [X] D. Line 7 generates a compiler error.
- [X] E. Line 8 generates a compiler error.
- [ ] F. Line 9 generates a compiler error.
- [ ] G. The code compiles as is.

### A3.
Option A (line 4) compiles because `short` is an integral type. Option B (line 5) generates a compiler error because `int` is an integral type, but 5.6 is a floating-point type. Option C (line 6) compiles because it is assigned a `String`. Options D and E (lines 7 and 8) do not compile becasue `short` and `int` are primitives. Primitives do not allow methods to be called on them. Option F (line 9) compiles because `length()` is defined on `String`.

### Q4. Given the following class, which of the following is true? (Choose all that apply)
```java
1:  public class Snake {
2:
3:    public void shed(boolean time) {
4:  
5:      if (time) {
6:    
7:      }
8:      System.out.println(result);
9:    
10:   }
11: }
```
- [X] A. If `String result = "done";` is inserted on line 2, the code will compile.
- [X] B. If `String result = "done";` is inserted on line 4, the code will compile.
- [ ] C. If `String result = "done";` is inserted on line 6, the code will compile.
- [ ] D. If `String result = "done";` is inserted on line 9, the code will compile.
- [ ] E. None of the above changes will make the code compile

### A4.
Adding the variable at line 2 makes `result` an instance variable. Since instance variables are in scope for the entire life of the object, option A is correct. Option B is correct because adding the variable at line 4 makes `result` a local variable with a scope if the whole method. Adding the variable at line 6 makes `result` a local variable with a scope of lines 6-7. Since it is out of scope on line 8, the `println` does not compile and option C is incorrect. Adding the variable at line 9 makes `result` a local varable with a scope of line 9 and 10. Since line 8 is before the declaration, it does not compile and option D is incorrect. Finally, option E is incorrect because the code can be made to compile.

### Q5. Give the following classes, which of the followin can independently replace `INSERT IMPORTS HERE` to make the code compile? (Choose all the apply)
```java
package aquarium;
public class Tank { }

package aquarium.jellies;
public class Jelly { }

package visitor;
INSERT IMPORTS HERE
public class AquariumVisitor {
  public void admire(Jelly jelly) { } }
```
- [ ] A. `import aquarium.*;`
- [ ] B. `import aquarium.*.Jelly;`
- [X] C. `import aquarium.jellies.Jelly;`
- [X] D. `import aquarium.jellies.*;`
- [ ] E. `import aquarium.jellies.Jelly.*;`
- [ ] F. None of these can make the code compile

### A5.
Option C is correct because it imports `Jelly` by classname. Option D is correct because it imports all the classes in the `jellies` package, which includes `Jelly`. Option A is incorrect because it only imports classes in the `aquarium` package -- `Tank` in this case -- and not those in lower-level packages. Option B is incorrect because you cannot use wildcards anyplace other than the end of an import statement. Option E is incorrect because you cannot import parts of a class with a regular import statement. Option F is incorrect because options C and D do make the code compile.

### Q6. Given the foloowing classes, what is the maximum number of imports that can be removed and have the code still compile?
```java
package aquarium; public class Water { }

package aquarium;
import java.lang.*;
import java.lang.System;
import aquarium.Water;
import aquarium.*;
public class Tank {
  public void print(Water water) {
    System.out.println(water); } }
```
- [ ] A. 0
- [ ] B. 1
- [ ] C. 2
- [ ] D. 3
- [X] E. 4
- [ ] F. Does not compile.

### A6.
The first two imports can be removed because `java.lang` is automatically imported. The second two imports can be removed because `Tank` and `Water` are in the same package, makin the correct answer E. If `Tank` and `Water` were in different packages, one of these two imports could be removed. In that case, the anser would be option D.

### Q7. Given the following classes, which of the following snippets can be inserted in the place of `INSERT IMPORTS HERE` and have the code compile? (Choose all that apply)
```java
package aquarium;
public class Water {
  boolean salty = false;
}
package aquarium.jellies;
public class Water {
  boolean salty = true;
}
package employee;
INSERT IMPORT HERE
public class WaterFiller {
  Water water;
}
```
- [X] A. `import aquarium.*;`
- [X] B. `import aquarium.Water; import aquarium.jellies.*;`
- [X] C. `import aquarium.*; import aquarium.jellies.Water;`
- [ ] D. `import aquarium.*; import aquarium.jellies.*;`
- [ ] E. `import aquarium.Water; import aquarium.jellies.Water;`
- [ ] F. None of these imports can make the code compile

### A7.
Option A is correct because it imports all the classes in the `aquarium` package including `aquarium.Water`. Option B and C are correct because they import `Water` by classname. Since importing by classname takes precedence over wildcards, these compile. Option D is incorrect because Java doesn't know which of the two wildcard `Water` classes to use. Option E is incorrect because you cannot specify the same classname in two imports.

### Q8. Given the following class, which of the following calls pring out `Blue Jay`? (Choose all that apply)
```java
public class BirdDisplay {
  public static void main(String[] name) {
    System.out.println(name[1]);
} }
```
- [ ] A. `java BirdDisplay Sparrow Blue Jay`
- [X] B. `java BirdDisplay Sparrow "Blue Jay"`
- [ ] C. `java BirdDisplay Blue Jay Sparrow`
- [ ] D. `java BirdDisplay "Blue Jay" Sparrow`
- [ ] E. `java BirdDisplay.class Sparrow "Blue Jay"`
- [ ] F. `java BirdDisplay.class "Blue Jay" Sparrow`
- [ ] G. Does not compile

### A8.
Option B is correct because arrays starts counting from zero and strings with spaces must be in quotes. Option A is incorrect because it ouputs `Blue`. C is incorrect because it outputs `Jay`. Option D is incorrect because it outputs `Sparrow`. Options E and F are incorrect because the output `Error: Could not find or load main class BirdDisplay.class`.

### Q9. Which of the following legally fill in the blank so you can run the `main()` method from the command line? (Choose all that apply)
```java
public static void main(_______)
```
- [X] A. `String[] _names`
- [ ] B. `String[] 123`
- [X] C. `String abc[]`
- [X] D. `String _Names[]`
- [X] E. `String... $n`
- [ ] F. `String names`
- [ ] G. None of the above

### A9.
Option A is correct because it is the traditional `main()` method signature and variables may begin with underscores. Options C and D are correct because the array operator may appear after the variable name. Option E is correct because varargs are allowed in place of an array. Option B is incorrect because variables are not allowed to begin with a digit. Option F is incorrect because the argument must be an array or varargs. Option F is a perfectly goog method. However, it is not one that can be run from the command line because it has the wrong parameter type.

### Q10. Which of the following are legal entry point methods that can be run form the command line? (Choose all that apply)
- [ ] A. `private static void main(String[] args)`
- [ ] B. `public static final main(String[] args)`
- [ ] C. `public  void main(String[] args)`
- [ ] D. `public static void test(String[] args)`
- [X] E. `public static void main(String[] args)`
- [ ] F. `public static main(String[] args)`
- [ ] G. None of the above

### A10.
Option E is the canonical `main()` method signature. You need to memorize it. Option A is incorrect because the `main()` method mist be `public`. Options B and F are incorrect because `main()` method must have a `void` return type. Option C is incorrect becasue `main()` must be `static`. Option D is incorrect because the `main()` method must be named `main`.

### Q11. Which of the following are true? (Choose all that apply)
- [ ] A. An instance variable of type `double` defaults to `null`
- [ ] B. An instance variable of type `int` defaults to `null`
- [X] C. An instance variable of type `String` defaults to `null`
- [X] D. An instance variable of type `double` defaults to `0.0`
- [ ] E. An instance variable of type `int` defaults to `0.0`
- [ ] F. An instance variable of type `String` defaults to `0.0`
- [ ] G. None of the above

### A11.
Option C is correct because all non-primitive values default to `null`. Option D is correct because `float` and `double` primitives default to `0.0`. Option B and E are incorrect because `int` primitive defauls to `0`.

### Q12. Which of the following are true? (Choose all that apply)
- [ ] A. A local variable of type `boolean` defaults to `null`
- [ ] B. A local variable of type `float` defaults to `0`
- [ ] C. A local variable of type `Object` defaults to `null`
- [ ] D. A local variable of type `boolean` defaults to `false`
- [ ] E. A local variable of type `boolean` defaults to `true`
- [ ] F. A local variable of type `float` defaults to `0.0`
- [X] G. None of the above

### A12.
Option G is correct because local variables do not get assigned default values. The code fails to compile if a local variable is not explicitly initialized. If this question were about instance variables, option D and F would be correct. A `boolean` primitive defualts to `false` and a `float` primitive defaults to `0.0`.

### Q13. Which of the following are true? (Choose all that apply)
- [X] A. An instance variable of type `boolean` defaults to `false`
- [ ] B. An instance variable of type `boolean` defaults to `true`
- [ ] C. An instance variable of type `boolean` defaults to `null`
- [X] D. An instance variable of type `int` defaults to `0`
- [ ] E. An instance variable of type `int` defaults to `0.0`
- [ ] F. An instance variable of type `int` defaults to `null`
- [ ] G. None of the above

### A13.
Options A and D are correct because `boolean` primitives default to `false` and `int` primitives default to `0`.

### Q14. Given the following class in the file `/my/directory/named/A/Bird.java`:
```java
INSERT CODE HERE
public class Bird {}
```
Which of the following replaces `INSERT CODE HERE` if we compile from `/my/directory`?
- [ ] A. `package my.directory.named.a;`
- [ ] B. `package my.directory.named.A;`
- [ ] C. `package named.a;`
- [X] D. `package named.A;`
- [ ] E. `package a;`
- [ ] F. `package A;`
- [ ] G. Does not compile

### A14.
The package name represents any folders underneath the curent path, which is `named.A` in this case. Option C is incorrect because package names are case sensitive, just like variable names and other indentifiers.

### Q15. Which of the following lines of code compile? (Choose all that apply)
- [X] A. `int i1 = 1_234;`
- [ ] B. `double d1 = 1_234_.0;`
- [ ] C. `double d2 = 1_234._0;`
- [ ] D. `double d3 = 1_234.0_;`
- [X] E. `double d4 = 1_234.0;`
- [ ] F. None of the above

### A15.
Underscores are allowed as long as they are directly between two other digits. This means options A and E are correct. Options B and C are incorrect because the underscore is adjacent to the decimal point. Option D is incorrect because the underscore is the last character.

### Q16. Given the following class, whihc of the following lines of code can replace `INSERT CODE HERE` to make the code compile? (Choose all that apply)
```java
public class Price {
  public void admission() {
    INSERT CODE HERE
    System.out.println(amount);
} }
```
- [ ] A. `int amount = 9L;`
- [X] B. `int amount = 0b101;`
- [X] C. `int amount = 0xE;`
- [X] D. `double amount = 0xE`
- [ ] E. `double amount = 1_2_.0_0;`
- [ ] F. `int amount = 1_2_;`
- [ ] G. None of the above

### A16.
`0b` is the prefix for a binary value and is correct. `0x` is the prefix for a hexadecimal value. This value cane be assigned to many primitive types, including `int` and `double`, making options C and D correct. Option A is incorrect because `9L` is a `long` value. `long amount = 9L` would be allowed. Option E is incorrect because the underscoreis immediately before the decimal. Option F is incorrect because the underscore is the very last character.

### Q17. Which of the following are true? (Choose all that apply)
```java
public class Bunny {
  public static void main(String[] args) {
    Bunny bun = new Bunny();
} }
```
- [X] A. `Bunny` is a class
- [ ] B. `bun` is a class
- [ ] C. `main` is a class
- [ ] D. `Bunny` is a refernce to an object
- [X] E. `bun` is a reference to an object
- [ ] F. `main` is a reference to an object
- [ ] G. None of the above

### A17.
`Bunny` is a class, which can be seen from the declaration: `public class Bunnny`. `bun` is a reference to and object. `main()` is a method.

### Q18. Which represent the order in which the following statements can be assembled into a program that will compile successfully? (Choose all that apply)
```java
A:  class Rabbit {}
B:  import java.util.*;
C:  package animals;
```
- [ ] A. A, B, C
- [ ] B. B, C, A
- [X] C. C, B, A
- [X] D. B, A
- [X] E. C, A
- [ ] F. A, C
- [ ] G. A, B

### A18.
`package` and `import` are both optional. If both are present, the order must be `package`, then `import`, then `class`. Option A is incorrect because `class` is before `package` and `import`. Option B is incorrect because `import` is before `package`. Option F is incorrect because `class` is before `package`. Option G is incorrect because `class` is before `import`.

### Q19. Suppose we have a class named `Rabbit`. Which of the following statements are true? (Choose all that apply)
```java
1:  public class Rabbit {
2:    public static void main(String[] args) {
3:      Rabbit one = new Rabbit();
4:      Rabbit two = new Rabbit();
5:      Rabbit three = one;
6:      one = null;
7:      Rabbit four = one;
8:      three = null;
9:      two = null;
10:     two = new Rabbit();
11:     System.gc();
12: } }
```
- [ ] A. The `Rabbit` object from line 3 is first eligible for garbage collection immediately following line 6.
- [X] B. The `Rabbit` object from line 3 is first eligible for garbage collection immediately following line 8.
- [ ] C. The `Rabbit` object from line 3 is first eligible for garbage collection immediately following line 12.
- [X] D. The `Rabbit` object from line 4 is first eligible for garbage collection immediately following line 9.
- [ ] E. The `Rabbit` object from line 4 is first eligible for garbage collection immediately following line 11.
- [ ] F. The `Rabbit` object from line 4 is first eligible for garbage collection immediately following line 12.

### A19.
The `Rabbit` object from line 3 has two references to it: `one` and `three`. The references are nulled out on lines 6 and 8, respectively. Option B is correct because this makes the object eligible for garbage collection after line 8. Line 7 sets the reference `four` to the now null `one`, which means it has no effect on garbage collection. The `Rabbit` object from line 4 only has a single reference to it: `two`. Option D is correct because this single reference becomes `null` on line 9. The `Rabbit` object declared on line 10 becomes eligible for garbage collection at the end of the method on line 12. Calling `System.gc()` has no effect on eligibility for garbage collection.

### Q20. What is true about the following code? (Choose all that apply)
```java
public class Bear {
  protected void finalize() {
    System.out.println("Roar!");
}
public static void main(String[] args) {
  Bear bear = new Bear();
  bear = null;
  System.gc();
} }
```
- [ ] A. `finalize()` is guaranteed to be called.
- [X] B. `finalize()` might or might not be called.
- [ ] C. `finalize()` is guarenteed not to be called.
- [ ] D. Garbage collection is guaranteed to run.
- [X] E. Garbage collection might or might not run.
- [ ] F. Garbage collection is guaranteed not to run.
- [ ] G. The code does not compile

### A20.
Calling `System.gc()` suggests that Java might wish to run the garbage collector. Java is free to ignore the request, making option E correct. `finalize()` runs if an object attempts to be garbage collected, making option B correct.

### Q21. What does the following code output?
```java
1:  public class Salmon {
2:    int count;
3:    public void Salmon() {
4:      count = 4;
5:    }
6:  public static void main(String[] args) {
7:    Salmon s = new Salmon();
8:    System.out.println(s.count);
9:  } }
```
- [X] A. 0
- [ ] B. 4
- [ ] C. Compilation fails on line 3.
- [ ] D. Compilation fails on line 4.
- [ ] E. Compilation fails on line 7.
- [ ] F. Compilation fails on line 8.

### A21.
While the code on line 3 does compile, it is not a constructor because it has a return type. It is a method that happens to have the same name as the class. When the code runs, the defualt constructor is called and count has the default value (0) for and `int`.

### Q22. Which of the following are true statements? (Choose all that apply)
- [ ] A. Java allows operator overloading.
- [X] B. Java code compiled on Windows can run on Linux.
- [ ] C. Java has pointers to specific locations in memory.
- [ ] D. Java is a procedural language.
- [X] E. Java is an object-oriented language.
- [ ] F. Java is a functional programming language.

### A22.
C++ has operator overloading and pointers. Java made a point of not having either. Jave does have references to objects, but these are pointing to an object that can move around in memory. Option B is correct because Java is playform independent. Option E is correct because Java is object oriented. While it does support some parts of functional programming, these occure within a class.

### Q23. Which of the following are true? (Choose all that apply)
- [ ] A. `javac` compiles a `.class` file into a `.java` file.
- [ ] B. `javac` compiles a `.java` file into a `.bytecode` file.
- [X] C. `javac` compiles a `.java` file into a `.class` file.
- [X] D. Java takes the name of the class as a parameter.
- [ ] E. Java takes the name of the `.bytecode` file as a parameter.
- [ ] F. Java takes the name of the `.class` file as a parameter.

### A23.
Java puts source code in `.java` files and bytecode in `.class` files. Id does not use a `.bytecode` file. When running a Java program, you pass just the name of the class without the `.class` extension.
