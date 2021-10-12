package com.pankaj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  // Find the even odd number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println(num + " is Even number.");
        }
        else{
            System.out.println(num + " is Odd number.");
        }
    }
}
