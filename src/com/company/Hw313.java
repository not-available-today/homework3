package com.company;

import java.util.Scanner;

public class Hw313 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of desired columms:");
        int columnCount = scanner.nextInt();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= columnCount; j++) {
                if (i % 2 != 0 && j % 2 != 0) {
                    System.out.print("black");
                }else if (i % 2 == 0 && j % 2== 0) {
                    System.out.print("black");
                }else {
                    System.out.print("white");
                }
                if(columnCount != j){
                    System.out.print("-");
                }


            }
            System.out.println();
        }
    }


}
