package com.company;

import java.util.Scanner;

public class Main {

    public static int ValueIndex(int[] Array, int n) {

        for(int i=1; i<=n; i++){
            if(Array[i] == i)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[100];

        for (int i=1; i<=n; i++){
            array[i] = sc.nextInt();
        }

//        int n = array.length;
        System.out.println("Fixed Point is " + ValueIndex(array, n));
    }
}
