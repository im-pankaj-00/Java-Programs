package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N Natural Number : ");
        int n = sc.nextInt();
        int sum = 0;
        int i;

        for(i=1; i<=n; i++) {
//          System.out.println(i);
            sum = sum + i;
        }
        System.out.println("Sum of first N Natural Number :" + sum);
    }
}
