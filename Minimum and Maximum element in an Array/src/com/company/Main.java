package com.company;

import java.util.Scanner;

public class Main {

    public static int getMax(int[] arr, int n) {
        int res = arr[0];
        for (int i=0; i<n; i++) {
            res = Math.max(res, arr[i]);
        }
        return res;
    }

    public static int getMin(int[] arr, int n) {
        int res = arr[0];
        for (int i=0; i<n; i++) {
            res = Math.min(res, arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Max : " + getMax(arr,n));
        System.out.println("Min : " + getMin(arr,n));
    }
}
