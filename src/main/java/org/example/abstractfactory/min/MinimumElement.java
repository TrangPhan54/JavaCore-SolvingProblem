package org.example.abstractfactory.min;

import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        System.out.println(findMin(readElements(readInteger())));
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an integer number");
        int integerNum = scanner.nextInt();
        return integerNum;
    }


    public static int[] readElements(int num) {
        Scanner scanner = new Scanner(System.in);
        int[] elementArray = new int[num];
        for (int i = 0; i < num; i++) {
            elementArray[i] = scanner.nextInt();
        }
        return elementArray;
    }

    public static int findMin(int[] arrayOfNum) {
        int min = arrayOfNum[0];
        for (int i = 0; i < arrayOfNum.length; i++) {
            if (min > arrayOfNum[i]) {
                min = arrayOfNum[i];
            }
        }
        return min;
    }
}
