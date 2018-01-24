# Chapter 1 Review Questions
### Q1. Which of the following are valid Java identifier? (Choose all that apply)
- A. A$B
- B. \_helloworld
- C. true
- D. java.lang
- E. Public
- F. 1980_s

### A1.

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
- A. Line 6 generates a compiler error.
- B. Line 7 generates a compiler error.
- C. There is no output.
- D. Empty = false, Brand = null
- E. Empty = false, Brand = 
- F. Empty = null, Brand = null

### A2.

### Q3. Which of the following are true? (Choose all that apply)
``` java
4:  short numPets = 5;
5:  int numGrains = 5.6;
6:  String name = "Scruffy";
7:  numPets.length();
8:  numGrains.length();
9:  name.length();
```
- A. Line 4 generates a compiler error.
- B. Line 5 generates a compiler error.
- C. Line 6 generates a compiler error.
- D. Line 7 generates a compiler error.
- E. Line 8 generates a compiler error.
- F. Line 9 generates a compiler error.
- G. The code compiles as is.

### A3.

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
- A. If `String result = "done";` is inserted on line 2, the code will compile.
- B. If `String result = "done";` is inserted on line 4, the code will compile.
- C. If `String result = "done";` is inserted on line 6, the code will compile.
- D. If `String result = "done";` is inserted on line 9, the code will compile.
- E. None of the above changes will make the code compile

### A4.

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
- A. `import aquarium.*;`
- B. `import aquarium.*.Jelly;`
- C. `import aquarium.jellies.Jelly;`
- D. `import aquarium.jellies.*;`
- E. `import aquarium.jellies.Jelly.*;`
- F. None of these can make the code compile

### A5.

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
- A. 0
- B. 1
- C. 2
- D. 3
- E. 4
- F. Does not compile.

### A6.

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
- A. `import aquarium.*;`
- B. `import aquarium.Water; import aquarium.jellies.*;`
- C. `import aquarium.*; import aquarium.jellies.Water;`
- D. `import aquarium.*; import aquarium.jellies.*;`
- E. `import aquarium.Water; import aquarium.jellies.Water;`
- F. None of these imports can make the code compile
