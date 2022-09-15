package com.bridgelabz.basics;

import java.util.Scanner;

    //Compute Quotient and Remainder

public class QuotientRemainder {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("enter divident : ");
            int divident = scanner.nextInt();
            System.out.print("enter divisor : ");
            int divisor = scanner.nextInt();

            int quotient = divident / divisor;
            System.out.println("Quotient = " + quotient);

            int remainder = divident % divisor;
            System.out.println("Remainder = " + remainder);
    }
}
