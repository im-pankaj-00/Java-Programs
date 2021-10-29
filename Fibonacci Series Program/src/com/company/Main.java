package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();

        int a = 0, b = 1, c;
        System.out.println(a);
        for(int i=2; i<=n; i++){
            System.out.println(b);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
