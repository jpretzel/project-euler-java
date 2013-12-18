package e004;

import utility.MathHelper;

public class Euler004 {
    public static void main(String[] args) {
        System.out.println(new Euler004().run());
    }

    public String run() {
        int greatestPalindrome = -1;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int test = i*j;
                if (MathHelper.isPalindrome(test)) {
                    if (test > greatestPalindrome) {
                        greatestPalindrome = test;
                    }
                }
            }
        }

        return Integer.toString(greatestPalindrome);
    }
}
