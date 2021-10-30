package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();

        int temp=a;
        a=b;
        b=c;
        c=temp;

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);

    }
}
