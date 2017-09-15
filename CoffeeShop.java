//Julia Zhu IBCS 15/09/2017
import java.util.Scanner;
public class CoffeeShop {
  public static void main(String[] arg){
    Scanner in= new Scanner(System.in);
    System.out.println("Welcome to JustBucks, I'm your barista Sup.");
    System.out.println("What can I get for you today?");
    String a = in.nextLine();

    Scanner in1= new Scanner(System.in);
    System.out.println("Great, can I get a size for the drink?");
    String b = in1.nextLine();

    Scanner in2= new Scanner(System.in);
    System.out.println("Name of the order?");
    String c = in2.nextLine();

    Scanner in3= new Scanner(System.in);
    System.out.println("Alright "+ c +", your total today will be 8 bucks.");
    String d = in3.nextLine();

    System.out.println("Awesome, your order will be out in a few minutes.");

    System.out.println(c+", your "+ a +" is ready! Have a nice day!");

  }
}
