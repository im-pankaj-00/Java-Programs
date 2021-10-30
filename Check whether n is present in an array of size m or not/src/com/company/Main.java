package com.company;

import java.util.Scanner;

public class Main {

    private static void check(int[] arr, int toCheckValue) {

        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }

        // Print the result
        System.out.println("Is " + toCheckValue
                + " present in the array: " + test);
    }

    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int toCheckValue = sc.nextInt();

            check(arr, toCheckValue);
        }
    }
}

