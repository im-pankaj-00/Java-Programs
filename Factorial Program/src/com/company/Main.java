package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Factorial Program
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n =sc.nextInt();

        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
