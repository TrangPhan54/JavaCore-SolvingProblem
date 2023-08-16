package org.example.abstractfactory.carpet;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number > 0) {
            int lastDigit;
            lastDigit = number % 10;
            while (number > 10) {
                number = number / 10;
            }
            return lastDigit + number;
        }
        return -1;
    }
}
