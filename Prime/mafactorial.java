import java.util.*;
public class mafactorial {

  public static long factorial(){
    long num;
    long fact=1;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    num = input.nextInt();
    for (int i=2;i<=num; i++){
        fact=fact*i;
      }
    System.out.println("Your answer is "+fact);
    return fact;
  }

  public static void main(String[] args) {
    factorial();

  }


}
