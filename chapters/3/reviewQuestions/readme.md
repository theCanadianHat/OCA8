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

### Q12. What is the result of the following code? (Choose all that apply)
```java
StringBuilder numbers = new StringBuilder("0123456789");
numbers.delete(2, 8);
numbers.append("-").insert(2, "+");
System.out.println(numbers);
```
### A12.

### Q13. What is the result of the following code?
```java
StringBuilder b = "rumble";
b.append("-").deleteCharAt(3).delete(3, b.length() - 1);
System.out.println(b);
```
### A13.

### Q14. Which of the following can replace line 4 to print `"avaJ"`? (Choose all that apply)
```java
3:  StringBuilder puzzle = new StringBuilder("Java");
4:  //INSERT CODE HERE
5:  System.out.println(puzzle);
```
### A14.

### Q15. Which of these array declarations is not legal? (Choose all that apply)
### A15.

### Q16. Which of these compile when replaceing 8? (Choose all that apply)
```java
7:  char[]c = new char[2];
8:  //INSERT CODE HERE
```
### A16.

### Q17. Which of these compile when replaceing 8? (Choose all that apply)
```java
7:  ArrayList l  = new ArrayList();
8:  //INSERT CODE HERE
```
### A17.

### Q18. Which of the following are true? (Choose all that apply)
### A18.

### Q19. Which of the following are true? (Choose all that apply)
### A19.

### Q20. What is the result of the following statements?
```java
6:  List<String> list = new ArrayList<String>();
7:  list.add("one");
8:  list.add("two");
9:  list.add(7);
10: for(String s: list) System.out.print(s);
```
### A20.

### Q21. What is the result of the following statements?
```java
3:  ArrayList<Integer> values = new ArrayList<String>();
4:  values.add(4);
5:  values.add(5);
6:  values.set(1, 6);
7:  values.remove(0);
8:  for (Integer v: values) System.out.print(v);
```
### A21.

### Q22. What is the result of the following?
```java
int[] random = { 6, -4, 12, 0 , -10};
int x = 12;
int y = Arrays.binarySearch(random, x);
System.out.println(y);
```
### A22.

### Q23. What is the result of the following?
```java
4:  List<Integer> list = Arrays.asList(10, 4, -1, 5);
5:  Collections.sort(list);
6:  Integer array[] = list.toArray(new Integer[4]);
7:  System.out.println(array[0]);
```
### A23.

### Q24. What is the result of the following?
```java
6:  String [] names = {"Tom", "Dick", "Harry"};
7:  List<String> list = names.asList();
8:  list.set(0, "Sue");
9:  System.out.println(names[0]);
```
### A24.

### Q25. What is the result of the following?
```java
List<String> hex = Arrays.asList("30", "8", "3A", "FF");
Collections.sort(hex);
int x = Collections.binarySearch(hex "8");
int y = Collections.binarySearch(hex "3A");
int z = Collections.binarySearch(hex "4F");
System.out.println(x + " " + y + " " + z);
```
### A25.

### Q26. Which of the following are true statements about the following code? (Choose all that apply)
```java
4:  List<Integer> ages = new ArrayList<>();
5:  ages.add(Integer.parseInt("5"));
6:  ages.add(Integer.valueOf("6"));
7:  ages.add(7);
8:  ages.add(null);
9:  for (int age: ages) System.out.print(age);
```
### A26.

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
### A27.

### Q28. Which of the following can be inserted into the blank to create a date of June 21, 2014? (Choose all that apply)
```java
import java.time.*;

public class StartOfSummer {

  public static void main(String[] args) {
    LocalDate date = ____________________
  }
  
}
```
### A28.

### Q29. What is the output of the following code?
```java
LocalDate date = LocaleDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
date.plusDays(2);
date.plusHours(3);
System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
```
### A29.

### Q30. What is the output of the following code?
```java
LocalDate date = LocaleDate.of(2018, Month.APRIL, 40);
System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
```
### A30.

### Q31. What is the output of the following code?
```java
LocalDate date = LocaleDate.of(2018, Month.APRIL, 30);
date.plusDays(2);
date.plusYears(3);
System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
```
### A31.

### Q32. What is the output of the following code?
```java
LocalDateTime d = LocaleDateTime.of(2015, 5, 10, 11, 22, 33);
Period p = Period.of(1, 2, 3);
d = d.minus(p);
DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
System.out.println(d.format(f));
```
### A32.

### Q33. What is the output of the following code?
```java
LocalDateTime d = LocaleDateTime.of(2015, 5, 10, 11, 22, 33);
Period p = Period.ofDays(1).ofYears(2);
d = d.minus(p);
DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
System.out.println(d.format(f));
```
### A33.
