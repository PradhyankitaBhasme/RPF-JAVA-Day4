package com.bridgelabz.basics;

import java.util.Scanner;

// Swap Two Numbers

public class SwapTwoNumbers {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("enter x=");
            int x = scanner.nextInt();
            System.out.print("enter y=");
            int y = scanner.nextInt();

            x = x+y; //30
            y = x-y;
            x = x-y;

            System.out.println("x = "+x);
            System.out.println("y = "+y);

    }
}
