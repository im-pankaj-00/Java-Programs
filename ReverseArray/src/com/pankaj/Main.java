package com.pankaj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i=0; i<5; i++) {
            array[i] = sc.nextInt();
        }
        for (int i=4; i>=0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
