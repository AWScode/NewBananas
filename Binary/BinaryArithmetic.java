/*
julia zhu
12/12/2017
Binary calculator
*/

import java.util.*;

public class BinaryArithmetic {

  public static void main(String[] args){
    System.out.println("Gimme your first 8-bits binary number :");
    Scanner input1= new Scanner(System.in);
    String num1= input1.nextLine();

    System.out.println("Gimme your second one :");
    Scanner input2= new Scanner(System.in);
    String num2= input2.nextLine();

    System.out.println("You wanna add, substract, multiply or divide?");
    Scanner input3= new Scanner(System.in);
    char operator= input3.next().charAt(0);

}
// sum
for(int i=maxim-1;i>-1;i--){
char x= smax[i];
char y= st[i];
 if(x==y && x=='0'){
      if(carry==0)
          sum[i]='0';
      else if(carry==1){
          sum[i]='1';
          carry=0;
 }
}
 else if(x==y && x=='1'){
     if(carry==0){
         sum[i]='0';
         carry=1;
     }
     else if(carry==1){
       sum[i]='1';
       carry=1;
     }
  }
  else if(x!=y){
     if(carry==0){
         sum[i]='1';
         }
     else if(carry==1){
       sum[i]='0';
       carry=1;
     }
    }        }
   String s=new String(sum);
  return s;
   }
/*
   static String add(double a, double b) {
       System.out.println(a + "first val :" + b);
       int a1 = (int) a;
       int b1 = (int) b;
       String s1 = Integer.toString(a1);
       String s2 = Integer.toString(b1);
       int number0 = Integer.parseInt(s1, 2);
       int number1 = Integer.parseInt(s2, 2);

       int sum = number0 + number1;
       String s3 = Integer.toBinaryString(sum);

       return s3;
   }


   static String multiply(double a, double b) {
       System.out.println(a + "first val :" + b);
       int a1 = (int) a;
       int b1 = (int) b;
       String s1 = Integer.toString(a1);
       String s2 = Integer.toString(b1);
       int number0 = Integer.parseInt(s1, 2);
       int number1 = Integer.parseInt(s2, 2);

       int sum = number0 * number1;
       String s3 = Integer.toBinaryString(sum);

       return s3;
   }

   static String sub(double a, double b) {
       System.out.println(a + "first val :" + b);
       int a1 = (int) a;
       int b1 = (int) b;
       String s1 = Integer.toString(a1);
       String s2 = Integer.toString(b1);
       int number0 = Integer.parseInt(s1, 2);
       int number1 = Integer.parseInt(s2, 2);

       int sum = number0 - number1;
       String s3 = Integer.toBinaryString(sum);

       return s3;
   }

   static String div(double a, double b) {
       System.out.println(a + "first val :" + b);
       int a1 = (int) a;
       int b1 = (int) b;
       String s1 = Integer.toString(a1);
       String s2 = Integer.toString(b1);
       int number0 = Integer.parseInt(s1, 2);
       int number1 = Integer.parseInt(s2, 2);

       int sum = number0 / number1;
       String s3 = Integer.toBinaryString(sum);

       return s3;
   }
   */
}
