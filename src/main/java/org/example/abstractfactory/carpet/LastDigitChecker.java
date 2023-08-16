package org.example.abstractfactory.carpet;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        } else {
            if (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int n) {
        if (n > 1000 || n < 10) {
            return false;
        }
        return true;
    }
}
