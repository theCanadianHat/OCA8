# Assessment Test Questions
## Q1. Which is the result of the following class? (Choose all that apply)
`
1:	public class \_C{
2: 		private static int $;
3:		public static void main(String[] main){
4:			String a_b;
5:			System.out.print($);
6:			System.out.print(a_b);
7:	} }
`
A. Compiler error on line 1.
B. Compiler error on line 2.
C. Compiler error on line 4.
D. Compiler error on line 5.
E. Compiler error on line 6.
F. 0null
G. nullnull
---
## A1. 
E. Option E is correct because local variables require assignment before referencing them. Option D is incorrect because class and instance variables have default values and allow referencing. `a_b` defaults to a `null` value. Options A, B, and C are incorrect because identifiers may begin with letter, underscore, or dollar sign. Options F and G are incorrect because that code does not compile. If `a_b` was an instance variable, the code would compile and output `0null`. For more information, see Chapter 1

## Q2. What is the result of the following code?
`
String s1 = "Java";
String s2 = "Java";
StringBuilder sb1 = new StringBuilder();
sb1.append("Ja").append("va");
System.out.println(s1 == s2);
System.out.println(s1.equals(s2);
System.out.println(sb1.toString() == s1);
System.out.println(sb1.toString().equals(s2);
`
A. `true` is printed out exactly once.
B. `true` is printed out exactly twice.
C. `true` is printed out exactly three times.
D. `true` is printed out exactly four times.
E. The code does not compile.
---
## A2. 
C. String literals are used from the string pool. This means that `s1` and `s2` refer to the same object and are equal. Therefore, the first two print statements print `true`. The third print statement prints `false` because `toString()` uses a method to compute the value and it is not from the string pool. The final print statement again prints `true` because `equals()` looks at the values of `String` objects. For more information, see Chapter 3.

## Q3. What is the output of the following code? (Choose all that apply)
`
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
`
A. 2
B. 3
C. The code will not compile because of line 3.
D. The code will not compile because of line 5.
E. The code will not compile because of line 7.
F. The code will not compile because of line 11.
G. The output cannot be determined from the code provided.
---
## A3.


### Assessment Test Answers
1.  f
2.  b
3.  b
4.  c
5.  d
6.  b
7.  c
8.  h
9.  ---
10. d,f
11. ---
12. d
13. a
14. ---
15. c,d,e
16.
17.
18.
19.
20.