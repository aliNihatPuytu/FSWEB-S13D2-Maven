package org.example;

public class Main {

    public static boolean isPalindrome(int n) {
        int x = Math.abs(n);
        int original = x;
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }
        return rev == original;
    }

    public static boolean isPerfectNumber(int n) {
        if (n < 1) return false;
        int sum = 0;
        for (int d = 1; d <= n / 2; d++) {
            if (n % d == 0) sum += d;
        }
        return sum == n;
    }

    public static String numberToWords(int n) {
        if (n < 0) return "Invalid Value";
        if (n == 0) return "Zero";

        String digits = Integer.toString(n);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < digits.length(); i++) {
            char c = digits.charAt(i);
            switch (c) {
                case '0' -> sb.append("Zero");
                case '1' -> sb.append("One");
                case '2' -> sb.append("Two");
                case '3' -> sb.append("Three");
                case '4' -> sb.append("Four");
                case '5' -> sb.append("Five");
                case '6' -> sb.append("Six");
                case '7' -> sb.append("Seven");
                case '8' -> sb.append("Eight");
                case '9' -> sb.append("Nine");
                default -> throw new IllegalArgumentException("Unexpected char: " + c);
            }
            if (i != digits.length() - 1) sb.append(' ');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("isPalindrome(-1221) = " + isPalindrome(-1221));
        System.out.println("isPalindrome(707)   = " + isPalindrome(707));
        System.out.println("isPalindrome(11212) = " + isPalindrome(11212));

        System.out.println("isPerfectNumber(6)  = " + isPerfectNumber(6));
        System.out.println("isPerfectNumber(28) = " + isPerfectNumber(28));
        System.out.println("isPerfectNumber(5)  = " + isPerfectNumber(5));
        System.out.println("isPerfectNumber(-1) = " + isPerfectNumber(-1));

        System.out.println("numberToWords(123)  = \"" + numberToWords(123)  + "\"");
        System.out.println("numberToWords(1010) = \"" + numberToWords(1010) + "\"");
        System.out.println("numberToWords(-12)  = \"" + numberToWords(-12)  + "\"");
    }
}
