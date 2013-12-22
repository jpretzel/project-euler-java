package solved.e005;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Euler005 {
    public static void main(String[] args) {
        System.out.println(new Euler005().run());
    }

    public String run() {
       int number = 1;

        for (int i = 1; i <= 20; i++) {
            number = leastCommonMultiple(number, i);
        }

        return Integer.toString(number);
    }

    private static int greatesCommonDivider(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        int remainder;
        while (true) {
            remainder = a % b;
            if (remainder == 0) {
                break;
            } else {
                a = b;
                b = remainder;
            }
        }

        return b;
    }

    private static int leastCommonMultiple(int a, int b) {
        return  a / greatesCommonDivider(a, b) * b;
    }
}
