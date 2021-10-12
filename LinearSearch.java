package com.pankaj;

import java.util.Scanner;

public class Main {

   
    public static int linearSearch(int[] array, int key) {
        int count = array.length;
        for (int i = count - 1; i >= 0; --i) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //Declare the array here
        int[] array = new int[100];

        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }


        int key = sc.nextInt();
        sc.close();

        linearSearch(array, key);

    }
}

