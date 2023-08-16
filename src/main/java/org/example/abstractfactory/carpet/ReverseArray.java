package org.example.abstractfactory.carpet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {15, 42, 38, -2, 0};
        reverse(array);

        ArrayList<Integer> result = justForFun();
        System.out.println(result);


    }

    private static void reverse(int[] arrayOfNums) {
        System.out.println("Array = "+ Arrays.toString(arrayOfNums));
        for (int i = 0; i < arrayOfNums.length / 2 ; i++) {
            int temp = arrayOfNums[i];
            arrayOfNums[i] = arrayOfNums[arrayOfNums.length - 1 - i];
            arrayOfNums[arrayOfNums.length - 1 - i] = temp;
        }
        System.out.println("Reversed array = "+ Arrays.toString(arrayOfNums));
    }
    public static ArrayList<Integer> justForFun(){
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(1,1000);
        return array;
    }
}
