package com.pankaj;

import java.util.Scanner;

public class Main {

    static int printUnion(int arr1[], int arr2[], int m, int n) {
        int i = 0, j = 0;
        System.out.print("Union : " + " ");
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++] + " ");
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }

        /* Print remaining elements of
         the larger array */
        while (i < m)
            System.out.print(arr1[i++] + " ");
        while (j < n)
            System.out.print(arr2[j++] + " ");

        return 0;
    }


    static void printIntersection(int arr1[], int arr2[], int m, int n) {
        int i = 0, j = 0;
        System.out.println();
        System.out.print("Intersection : " + " ");
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Array Size : ");

        int m = sc.nextInt();
        System.out.print("Enter Second Array Size : ");

        int n = sc.nextInt();
        int arr1[] = new int[m];
        System.out.print("Insert The First Array Element : ");
        for (int i=0; i<m; i++){
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[n];
        System.out.print("Insert The Second Array Element : ");
        for (int i=0; i<n; i++) {
            arr2[i] = sc.nextInt();
        }

        printUnion(arr1, arr2, m, n);
        printIntersection(arr1, arr2, m, n);
    }
}
