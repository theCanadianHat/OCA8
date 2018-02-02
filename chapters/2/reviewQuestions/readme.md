# Chapter 2 Review Questions

### Q1. Which of the following Java operators can be used with `boolean` variables? (Choose all that apply)
### A1.

### Q2. What data type (or types) will allow the following code snippet to compile? (Choose all that apply)
```java
byte x = 5;
byte y = 10;
____ z = x + y;
```
### A2.

### Q3. What is the output of the following application?
```java
1:  public class CompareValues {
2:    public static void main(String[] args) {
3:      int x = 0;
4:      while(x++ < 10) {}
5:      String message = x > 10 ? "Greater than" : false;
6:      System.out.println(message+","+x);
7:    }
8:  }
```
### A3.

### Q4. What change would allow the following code snippet to compile? (Choose all that apply)
```java
3:  long x = 10;
4:  int y = 2 * x;
```
### A4.

### Q5. What is the output of the following code snippet?
```java
3:  java.util.List<Integer> list = new java.util.ArrayList<Integer>();
4:  list.add(10);
5:  list.add(14);
6:  for(int x : list) {
7:    System.out.print(x + ", ");
8:    break;
9:  }
```
### A5.

### Q6. What is the output of the followig code snippet?
```java
3:  int x = 4;
4:  long y = x * 4 - x++;
5:  if(y<10) System.out.println("Too Low");
6:  else System.out.println("Just right");
7:  else System.out.println("Too High");
```
### A6.

### Q7. What is the output of the following code?
```java
1:  public class TernaryTester {
2:    public static void main(String[] args) {
3:      int x = 5;
4:      System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
5:  } }
```
### A7.

### Q8. What is the output of the following code snippet?
```java
3:  boolean x = true, z = true;
4:  int y = 20;
5:  x = ( y != 10) ^ (z=false);
6:  System.out.println(x+", "+y+", "+z);
```
### A8.

### Q9. How many times will the following code print `"Hello World"`?
```java
3:  for(int i=0; i<10 ; ) {
4:    i = i++;
5:    System.out.println("Hello World");
6:  }
```
### A9.

### Q10. What is the output of the following code?
```java
3:  byte a = 40, b = 50;
4:  byte sum = (byte) a + b;
5:  System.out.println(sum);
```
### A10.

### Q11. What is the output of the following code?
```java
1:  public class ArithmeticSample {
2:    public static void main(String[] args) {
3:      int x = 5 * 4 % 3;
4:      System.out.println(x);
5:  }}
```
### A11.

### Q12. What is the output of the following code snippet?
```java
3:  int x = 0;
4:  String s = null;
5:  if(x == s) System.out.println("Success");
6:  else System.out.println("Failure");
```
### A12.

### Q13. What is the output of the following code snippet?
```java
3:  int x1 = 50, x2 = 75;
4:  boolean b = x1 >= x2;
5:  if(b = true) System.out.println("Success");
6:  else System.out.println("Failure");
```
### A13.

### Q14. What is the output of the following code snippet?
```java
3:  int c = 7;
4:  int result = 4;
5:  result += ++c;
6:  System.out.println(result);
```
### A14.

### Q15. What is the out of the following code snippet?
```java
3:  int x = 1, y = 15;
4:  while x < 10
5:    y--;
6:    x++;
7:  System.out.println(x+", "+y);
```
### A15.

### Q16. What is the out of the following code snippet?
```java
3:  do {
4:    int y = 1;
5:    System.out.print(y++ + " ");
6:  } while(y <= 10);
```
### A16.

### Q17. What is the out of the following code snippet?
```java
3:  boolean keepGoing = true;
4:  int result = 15, i = 10;
5:  do {
6:    i--;
7:    if(i==18) keepGoing = false;
8:    result -=2;
9:  } while(keepGoing);
10: System.out.println(result);
```
### A17.

### Q18. What is the output of the following code snippet?
```java
3:  int count = 0;
4:  ROW_LOOP: for(int row = 1; row <=3; row++)
5:    for(int col = 1; col <=2 ; col++) {
6:      if(row * col % 2 == 0) continue ROW_LOOP;
7:      count++;
8:    }
9:  System.out.println(count);
```
### A18.

### Q19. What is the output of the following code snippet?
```java
3:  int m = 9, n = 1, x = 0;
4:  while(m > n) {
5:    m--;
6:    n += 2;
7:    x += m + n;
8:  }
9:  Systen.out.println(x);
```
### A19.

### Q20. What is the output of the following code snippet?
```java
3:  final char a = 'A', d = 'D';
4:  char grade = 'B';
5:  switch(grade) {
6:    case a:
7:    case 'B': System.out.print("great");
8:    case 'C': System.out.print("good"); break;
9:    case d: 
10:   case 'F': System.out.print("not good");
11: }
```
### A20.
