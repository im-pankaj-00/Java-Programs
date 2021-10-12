package com.pankaj;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return nums[i];
            }
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
        System.out.println("Duplicate Number is :  " + findDuplicate(array));
    }
}

