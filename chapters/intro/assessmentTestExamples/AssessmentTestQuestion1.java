public class AssessmentTestQuestion1{
    private static int $;
    public static void main(String[] main){
      String a_b;
      System.out.print($);
      System.out.print(a_b); //compilation error due to a_b not being initialized
  }
}

/*
Compilation Fails:
------------------
AssessmentTestQuestion1.java:6: error: variable a_b might not have been initialized
                        System.out.print(a_b); //compilation error due to a_b not being initialized
                                         ^
1 error
*/