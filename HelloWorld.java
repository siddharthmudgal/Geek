import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

class HelloWorld {
    public static void main(String args[] ) throws Exception {
        BigInteger n;
        BigInteger sum,k,rem;
        BigInteger test_cases;

            Scanner reader = new Scanner(new FileReader("input.txt"));

            test_cases = reader.nextBigInteger();
            while (test_cases.compareTo(BigInteger.ZERO) == 1 && reader.hasNext()) {

                n = reader.nextBigInteger();
                k = reader.nextBigInteger();
                sum = n.multiply(n.add(BigInteger.ONE));
                sum = sum.divide(new BigInteger("2"));

                if (sum.remainder(k)== BigInteger.ZERO) {
                    System.out.println(0);
                    test_cases.subtract(BigInteger.ONE);
                    continue;
                }
                if (sum.compareTo(k) == 1)
                {

                    System.out.println(sum.subtract(k));
                    test_cases.subtract(BigInteger.ONE);
                    continue;
                }
                if (sum.compareTo(k) == -1)
                {
                    rem = k.remainder(sum);
                    rem = sum.subtract(rem);
                    System.out.println(rem);
                    test_cases.subtract(BigInteger.ONE);
                    continue;
                }

                if (k.equals(BigInteger.ZERO))
                {

                }
            }

    }


}
