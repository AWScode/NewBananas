public class Mersenne {

  public static int mersennePrime(int power){
    long finalM = 0;
    for (int i = 1; i < power; i++){
      long mNum = 2^i - 1;
      if checkPrime(mNum){
        finalM = mNum;
      }
    }

    return finalM;

    public static void main(String[] args) {

      System.out.println("Hey welcome to this program that checks for Mersenne prime, gimme a number")

      Scanner userIn = new Scanner(System.in);
      int baseNum = userIn.nextIn();
    }
  }
