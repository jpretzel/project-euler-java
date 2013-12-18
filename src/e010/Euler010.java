package e010;

import utility.MathHelper;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */
public class Euler010 {
    public static void main(String[] args) {
        System.out.println(new Euler010().run());
    }

    public String run() {
        long sum = 0;

        boolean[] sieve = MathHelper.generatePrimeSieve(2000000);
        for (int i = 0, count = sieve.length; i < count; i++) {
            if (sieve[i]) {
                sum += i;
            }
        }

        return Long.toString(sum);
    }
}
