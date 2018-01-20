interface HasTail { int getTailLength(); }
abstract class Puma implements HasTail {
  protected int getTailLength() { return 4; }
}
public class Cougar extends Puma {
  public static void main(String[] args){
    Puma puma = new Puma();
      System.out.println(puma.getTailLength());
  }
    
public int getTailLength(int length) { return 2; }
}

/*
Compilation Fails:
------------------
AssessmentTestQuestion3.java:5: error: class Cougar is public, should be declared in a file named Cougar.java
public class Cougar extends Puma {
       ^
AssessmentTestQuestion3.java:3: error: getTailLength() in Puma cannot implement getTailLength() in HasTail
        protected int getTailLength() { return 4; }
                      ^
  attempting to assign weaker access privileges; was public
AssessmentTestQuestion3.java:7: error: Puma is abstract; cannot be instantiated
                Puma puma = new Puma();
                            ^
3 errors
*/