package chapter2;

/**
 * @author Viet Quoc Tran vt on 2019-07-21. www.zeroexception.com
 */
public class TernaryOperator {

  public static void main(String[] args) {

    int a = 1;
    int b = 2;

    int c;

    if (a > b) {
      c = 100;
    } else {
      c = 200;
    }
    System.out.println("c = " + c);

    int d = a > b ? 100 : 200;
    System.out.println("d = " + d);

    String e = a % 2 == 0 ? "a is even" : "a is odd";
    System.out.println(e);


  }

}
