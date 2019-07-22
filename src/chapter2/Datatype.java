package chapter2;

import java.util.Scanner;

/**
 * @author Viet Quoc Tran on 2019-07-21. www.zeroexception.com
 */
public class Datatype {

  public static void main(String[]  args) {

//    Range of byte is -128; 127
    Scanner scanner = new Scanner(System.in);
    System.out.print(" Input byte number a: ");
    byte a = scanner.nextByte();
    System.out.print(" Input byte number b: ");
    byte b = scanner.nextByte();

    byte c = (byte)(a +  b);

    System.out.println("a + b = " + c);



  }

}
