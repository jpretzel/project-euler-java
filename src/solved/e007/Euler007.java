package solved.e007;

import utility.MathHelper;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10001st prime number?
 */
public class Euler007 {
    public static void main(String[] args) {
        System.out.println(new Euler007().run());
    }

    public String run() {
        int primeCount = 0, i = 2;

        while (true) {
            if (MathHelper.isPrime(i)) {
                primeCount++;
                if (primeCount == 10001) {
                    return Integer.toString(i);
                }
            }
            i++;
        }
    }


}
