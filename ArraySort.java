package com.pankaj;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        int i;
        for(i = 0; i < 6; ++i) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(i = 0; i < 6; ++i) {
            System.out.print(arr[i] + " ");
        }

    }
}
