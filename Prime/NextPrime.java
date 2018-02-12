import java.math.BigInteger;

public class NextPrime {

            public static void main(String[] args) {
                        int number = 1;
                        Long nextPrime = nextPrime(number);
                        System.out.println("Next prime of " + number + " is " +nextPrime);

            }
            private static Long nextPrime(int number) {
                        BigInteger bValue = BigInteger.valueOf(number);
                        bValue = bValue.nextProbablePrime();

                        return Long.parseLong(bValue.toString());
            }
}
