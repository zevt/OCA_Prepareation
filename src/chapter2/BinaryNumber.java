package chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Viet Quoc Tran vt on 2019-07-21. www.zeroexception.com
 */
public class BinaryNumber {

  public static void main(String[]  args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print(" Input integer number: ");
    int a = scanner.nextInt();

    List<Character> binaryChars = new ArrayList<>();

    while(a > 0){
      if(a%2 == 1){
        binaryChars.add('1');
      }
      else{
        binaryChars.add('0');
      }
      a/=2;
    }
    for(int i = binaryChars.size() - 1; i >= 0; --i){
      System.out.print(binaryChars.get(i));
    }
  }

}
