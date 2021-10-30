package com.pankaj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email I'd : ");
        String email = sc.next();
        String userName = "";

        for (int i=0; i<email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            }
            else {
                userName += email.charAt(i);
            }
        }
        System.out.println(userName);
    }
}
