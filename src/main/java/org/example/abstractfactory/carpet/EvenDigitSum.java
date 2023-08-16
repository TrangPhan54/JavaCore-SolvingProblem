package org.example.abstractfactory.carpet;

public class EvenDigitSum {
    public static void main(String[] args) {
        int re = getEvenDigitSum(123);
        System.out.println(re);
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum = 0;
            while (number >= 10) {
                int lastDigit = number % 10;
                number = number / 10;
                if (lastDigit % 2 == 0) {
                    sum += lastDigit;
                }
            }
            if (number % 2 == 0) {
                sum += number;
            }
            return sum;
        }
    }
}
