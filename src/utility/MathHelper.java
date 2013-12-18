package utility;

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
}
