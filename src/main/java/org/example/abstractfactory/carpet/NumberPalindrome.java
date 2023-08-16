package org.example.abstractfactory.carpet;

public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(1221);
        System.out.println(isPalindrome(10));

    }

    public static boolean isPalindrome(int number) {
        int startNumber = number;
        int reverse = 0;
        while (number >= 10) {
            int lastDigit = number % 10;
            number = number / 10;
            reverse += lastDigit;
            reverse *= 10;
        }
        reverse += number;
        if (reverse == startNumber) {
            return true;
        }
        return false;

    }

}
