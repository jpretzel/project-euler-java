package utility;

import java.util.Arrays;

public final class MathHelper {
    public static boolean isPrime(Long number) {
        if (number < 2) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        boolean isPrime = true;

        for (long i = 3; i <= Math.sqrt(number); i+=2) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static boolean isPrime(int i) {
        return isPrime((long) i);
    }

    public static boolean isPalindrome(int number) {
        return isPalindrome(Integer.toString(number));
    }

    public static boolean isPalindrome(String s) {
        return s.equals(StringHelper.reverse(s));
    }

    // using an atkin algorithm
    public static boolean[] generatePrimeSieve(int limit) {
        int limitSqrt = (int) Math.sqrt(limit);
        boolean[] sieve = new boolean[limit + 1];
        Arrays.fill(sieve, false);

        if (limit < 4) {
            throw new IllegalArgumentException("limit must be greater than 3");
        }

        sieve[0] = false;
        sieve[1] = false;
        sieve[2] = true;
        sieve[3] = true;

        for (int x = 1; x <= limitSqrt; x++) {
            for (int y = 1; y <= limitSqrt; y++) {
                int n = (4 * x * x) + (y * y);
                if (n <= limit && (n % 12 == 1 || n % 12 == 5)) {
                    sieve[n] = !sieve[n];
                }

                n = (3* x * x) + (y * y);
                if (n <= limit && (n % 12 == 7)) {
                    sieve[n] = !sieve[n];
                }

                n = (3* x * x) - (y * y);
                if (x > y && n <= limit && (n % 12 == 11)) {
                    sieve[n] = !sieve[n];
                }
            }
        }

        for (int n = 5; n <= limitSqrt; n++) {
            if (sieve[n]) {
                int x = n * n;
                for (int i = x; i <= limit; i += x) {
                    sieve[i] = false;
                }
            }
        }

        return sieve;
    }
}
