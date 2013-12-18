package e003;

import utility.MathHelper;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Euler003 {
    public static void main(String[] args) {
        System.out.println(new Euler003().run());
    }

    public String run() {
        return Long.toString(findLargestPrimeFactor(600851475143L));
    }

    private Long findLargestPrimeFactor(Long number) {
        Long largestPrime = number;

        for (long i = 2; i <= number; i++) {
            if (!MathHelper.isPrime(i)) {
                continue;
            }

            largestPrime = i;
            while (number % i == 0) {
                number /= i;
            }
        }

        return largestPrime;
    }
}
