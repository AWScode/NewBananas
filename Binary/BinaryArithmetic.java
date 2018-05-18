/*
julia zhu
12/12/2017
Binary calculator
*/
import java.util.*;

public class BinaryArithmetic {
  public static void main(String[] args){
    System.out.print("Gimme your first binary number : ");
    Scanner in= new Scanner(System.in);
    int la = in.nextInt();
    System.out.print("Gimme your second one : ");
    int lb = in.nextInt();
  }
  public String addBinary(String a, String b) {
      int la = a.length();
      int lb = b.length();

      int max = Math.max(la, lb);

      StringBuilder sum = new StringBuilder("");
      int carry = 0;

      for(int i = 0; i < max; i++){
          int m = getBit(a, la - i - 1);
          int n = getBit(b, lb - i - 1);
          int add = m + n + carry;
                    sum.append(add % 2);
          carry = add / 2;
      }

      if(carry == 1)
          sum.append("1");

      return sum.reverse().toString();
            }

  public int getBit(String s, int index){
      if(index < 0 || index >= s.length())
          return 0;

      if(s.charAt(index) == '0')
                return 0;
        else
          return 1;

    }
}
