package com.company;

import java.util.Scanner;

public class Hw39 {
    public static void main(String[] args) {
        int userNum, i, cube;
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer: ");
        userNum = input.nextInt();

        for (i = 1; i < userNum; i++) {
            System.out.println("The number is: " +i+ " and the cube of it is " +Math.pow(i, 3));
        }


    }
}
