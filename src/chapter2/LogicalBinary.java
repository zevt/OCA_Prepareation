package chapter2;

/**
 * @author Viet Quoc Tran on 2019-07-21. www.zeroexception.com
 */
public class LogicalBinary {

  public static void main(String[]  args) {

   int a = 5;
   int b = 3;

    System.out.println(a & b);
    System.out.println(a ^ b);
    System.out.println(a | b);
    //the output of below is 10
    System.out.println(a  << 1);
//    the output is 20
    System.out.println(a  << 2);
//    the output is 2
    System.out.println(a  >> 1);
  }

}
