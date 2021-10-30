package com.pankaj;

import javax.swing.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Array sort
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i=0; i<6; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i=0; i<6; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
