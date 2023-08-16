package org.example.abstractfactory.carpet;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));

        printConversion(95.75);
    }

    public static int getLargestPrime(int number) {
        int i = 1;
        int max = 0;
        while (number > 1) {
            i++;
            if (number % i == 0) {
                for (int j = 1; j <= Math.sqrt(i);j++) {
                    break;
                }
                if(max < i){
                    max = i;
                }
                number = number/i;
            }
        }
        return i;
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        }
        double result = kilometersPerHour * 0.62137119;

        return Math.round(result);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(kilometersPerHour+" km/h = "+ (int) Math.ceil(kilometersPerHour*0.62137119)+ " mi/h");
        }
    }


}
