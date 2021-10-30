package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i=0;i<n;i++) {
            if(arr[i] == key) {
                count++;
            }
        }
        System.out.println(count);
    }
}
