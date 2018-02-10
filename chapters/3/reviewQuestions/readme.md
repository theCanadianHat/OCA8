# Chapter 3 Review Questions

### Q1. What is output by the following code? (Choose all that apply)
```java
1:  public class Fish {
2:    public static void main(String[] args) {
3:      int numFish = 4;
4:      String fistType = "tuna";
5:      String anotherFish = numFish + 1;
6:      System.out.println(anotherFish + " " + fishType);
7:      System.out.println(numFish + " " + 1);
8:  } }
```

### A1.

### Q2. Which of the followoing are output by this code? (Choose all that apply)
```java
3:  String s = "Hello";
4:  String t = new String(s);
5:  if ("Hello".equals(s)) System.out.println("one");
6:  if (t == s) System.out.println("two");
7:  if (t.equals(s)) System.out.println("three");
8:  if ("Hello" == s) System.out.println("four");
9:  if ("Hello" == t) System.out.println("five");
```

### A2.

### Q3. Which are true statements? (Choose all that apply)
### A3.

### Q4. What is the result of the following code?
```java
7:  StringBuilder sb = new StringBuilder();
8:  sb.append("aaa").insert(1, "bb").insert(4, "ccc");
9:  System.out.println(sb);
```
### A4.

### Q5. What is the result of the following code?
```java
2:  String s1 = "java";
3:  StringBuilder s2 = new StringBuilder("java");
4:  if (s1 == s2)
5:    System.out.print("1");
6:  if (s1.equals(s2))
7:    System.out.print("2");
```
### A5.

### Q6. What is the result of the following code?
```java
public class Lion {
  public void roar(String roar1, StringBuilder roar2) {
     roar1.concat("!!!");
     roar2.append("!!!");
  }
public static void main(String[] args) {
  String roar1 = "roar";
  StringBuilder roar2 = new StringBuilder("roar");
  new Lion().roar(roar1, roar2);
  System.out.println(roar1 + " " + roar2);
} }
```
### A6.

### Q7. Which are the results of the following code? (Choose all that apply)
```java
String letters = "abcdef";
System.out.println(letters.length());
System.out.println(letters.charAt(3));
System.out.println(letters.charAt(6));
```
### A7.

### Q8. 
```java
String numbers = "0123456789";
System.out.println(numbers.substring(1, 3));
System.out.println(numbers.substring(7, 7));
System.out.println(numbers.substring(7));
```
### A8. 

### Q9. What is the result of the following code?
```java
3:  String s = "purr";
4:  s.toUpperCase();
5:  s.trim();
6:  s.substring(1, 3);
7:  s += " two";
8:  System.out.println(s.length());
```
### A9.

### Q10. What is the result of the following code? (Choose all the apply)
```java
13: String a = "";
14: a += 2;
15: a +='c';
16: a += false;
17: if( a == "2cfalse") System.out.println("==");
18: if( a.equals("2cfalse")) System.out.println("equls");
```
### A10.

### Q11. What is the result of the following code?
```java
4:  int total = 0;
5:  StringBuilder letters = new StringBuilder("abcdefg");
6:  total += letters.substring(1, 2).length();
7:  total += letters.substring(6, 6).length();
8:  total += letters.substring(6, 5).length();
9:  System.out.println(total);
```
### A11.

### Q12. 
### A12.

### Q13. What is the result of the following code?
### A13.

### Q14.
### A14.

### Q15.
### A15.

### Q16.
### A16.

### Q17.
### A17.

### Q18.
### A18.

### Q19.
### A19.

### Q20.
### A20.

### Q21.
### A21.

### Q22.
### A22.

### Q23.
### A23.

### Q24.
### A24.

### Q25.
### A25.

### Q26.
### A26.

### Q27.
### A27.

### Q28.
### A28.

### Q29.
### A29.

### Q30.
### A30.

### Q31.
### A31.

### Q32.
### A32.

### Q33.
### A33.
