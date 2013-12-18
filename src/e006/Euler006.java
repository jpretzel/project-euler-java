package e006;

/**
 * The sum of the squares of the first ten natural numbers is,
 *                  1^2 + 2^2 + ... + 10^2 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 *               (1 + 2 + ... + 10)^2 = 55^2 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
 * 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the
 * sum.
 */
public class Euler006 {
    public static void main(String[] args) {
        System.out.println(new Euler006().run(100));
    }

    public String run(int x) {
        int sum = 0, squareSum = 0;

        for (int i = 1; i <= x; i++) {
            sum += i;
            squareSum += i*i;
        }

        return Integer.toString(sum * sum - squareSum);
    }
}
