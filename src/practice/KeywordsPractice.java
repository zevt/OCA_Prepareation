package practice;

public class KeywordsPractice {

  public static void main(String[] args){

    System.out.println(" =============  continue keyword ========");
    for (int i = 0; i < 5; ++i) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.println(" i = " + i);
    }

    System.out.println(" =============  break keyword    ========");

    for (int i = 0; i < 5; ++i) {
      if (i % 2 == 0) {
        break;
      }
      System.out.println(" i = " + i);
    }


  }

}
