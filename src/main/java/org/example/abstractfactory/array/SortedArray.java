package org.example.abstractfactory.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        int[] result = sortedIntegers(printArray(getIntegers(5)));
        System.out.println(Arrays.toString(result));

    }

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayOfNums = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("enter element of array: ");
            arrayOfNums[i] = scanner.nextInt();
        }
        return arrayOfNums;
    }

    public static int[] printArray(int[] arrayOfNumber) {
        for (int i = 0; i < arrayOfNumber.length; i++) {
            System.out.println("Element " + i + " contents " + arrayOfNumber[i]);
        }
        return arrayOfNumber;
    }

    public static int[] sortedIntegers(int[] unsortedArray) {
        int temp;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (unsortedArray[i] < unsortedArray[i + 1]) {
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i + 1];
                    unsortedArray[i + 1] = temp;
                    swapped = true;
                }
            }
        }
        return unsortedArray;
    }

}
