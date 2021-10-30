package com.company;

import java.util.Arrays;

public class Main {

    public static int[] BubbleSort(int[] number){
        int n = number.length;
        for (int i=0; i<n; i++){
            for (int j=1; j<(number.length - i); j++){
                if(number[j-1] > number[j]) {
                    swap(j-1, j , number);
                }
            }
        }
        return number;
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
	// write your code here
        int[] randomNumber = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
        int[] sortedNumber;
        sortedNumber = BubbleSort(randomNumber);
        System.out.println(Arrays.toString(sortedNumber));
    }
}
