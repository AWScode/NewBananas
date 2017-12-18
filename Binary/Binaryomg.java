/*
Binary Calculator
Julia Zhu
IDK how to change my errors
I don't even know what i am doing
whatever grade this gets is fine i give up
*/
import java.util.*;
import java.lang.*;

public class Binaryomg{

  public static String[] addition(String[] shu1, String[] shu2){
    String[] sum = new String[8];
    boolean car = false;
    for(int i = 7; i>-1; i--){
      if(car==false){
          if(shu1[i].equals("1") && shu2[i].equals("1")){
            an[i] = "0";
            car = true;
          }
          else if((shu1[i].equals("1") && shu2[i].equals("0")) || (shu1[i].equals("0") && shu2[i].equals("1"))){
            an[i] = "1";
            car = false;
          }
          else{
            shu1[i] = "0";
            car = false;
          }
        }
        else{
          if(shu1[i].equals("1") && shu2[i].equals("1")){
            an[i] = "1";
            car = true;
          }
          else if((shu1[i].equals("1") && shu2[i].equals("0")) || (shu1[i].equals("0") && shu2[i].equals("1"))){
            an[i] = "0";
            car = true;
          }
          else{
            an[i] = "1";
            car = false;
          }
        }
      }
      return an;
    }

  public static void main(String[] args){

    System.out.println("Hey user, gimme a 8-bits-binary number.");
    Scanner in = new Scanner(System.in);
    String inp1 = in.nextLine();

    System.out.println("Now a second one.");
    Scanner in2 = new Scanner(System.in);
    String inp2 = in2.nextLine();

    System.out.println("What you wanna do? Addition, subtraction, multuplication or division?");
    Scanner in3 = new Scanner(System.in);
    String choice = in3.nextLine();

    if(!(choice.equals("addition")||choice.equals("Addition")||choice.equals("ADDITION")||choice.equals("subtraction")||choice.equals("Subtraction")||choice.equals("SUBTRACTION")||choice.equals("multiplication")||choice.equals("MULTIPLICATION")||choice.equals("Multiplication")||choice.equals("division"))){
      System.out.println("Dude what did you enter.");
      System.exit(0);
    }

    String[] shu1 = inp1;
    String[] shu2 = inp2;

    if((choice.equals("Addition")||choice.equals("addition")||choice.equals("ADDITION"))){
      System.out.println(Arrays.toString(shu1));
      System.out.println(Arrays.toString(shu2));
      String[] an = addition(shu1,shu2);
      System.out.println(Arrays.toString(an));
    }

    if((choice.equals("Subtraction")||choice.equals("subtraction")||choice.equals("SUBTRACTION"))){
      System.out.println(Arrays.toString(shu1));
      System.out.println(Arrays.toString(shu2));
      String[] an = subtraction(shu1,shu2);
      System.out.println(Arrays.toString(an));
    }
/*
    if((choice.equals("multiplication")||choice.equals("Multiplication")||choice.equals("MULTIPLICATION"))){
      System.out.println(Arrays.toString(shu1));
      System.out.println(Arrays.toString(shu2));
      String[] an = multiplication(shu1,shu2);
      System.out.println(Arrays.toString(an));
    }

    if((choice.equals("division")||choice.equals("Division")||choice.equals("DIVISION"))){
      System.out.println(Arrays.toString(shu1));
      System.out.println(Arrays.toString(shu2));
      String[] an = division(shu1,shu2);
      System.out.println(Arrays.toString(an));
    }
*/
  }
}
