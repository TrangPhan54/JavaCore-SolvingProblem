package org.example.abstractfactory.carpet;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FactorPrinter {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor1(12,8));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        List<Integer> commonDivisor = new ArrayList<>();
        for (int i = 1; i <= Math.min(first, second); i++) {
            if (first % i == 0 && second % i == 0) {
                commonDivisor.add(i);
            }
        }
        int max = 0;
        for (int i = 0; i < commonDivisor.size(); i++) {
            if (max < commonDivisor.get(i)) {
                max = commonDivisor.get(i);
            }
        }
        return max;
    }
    public static int getGreatestCommonDivisor1(int first, int second) {
        if(first < 10 || second < 10){
            return -1;
        }
        int max = 0;
        for (int i = 1; i <= Math.min(first, second); i++) {
            if (first % i == 0 && second % i == 0) {
                if(max < i){
                    max = i;
                }
            }
        }

        return max;
    }
}
