package com.bridgelabz.basics;

import java.util.Scanner;

        //Check Whether a Number is Even or Odd

public class OddEven {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter The number \nn = ");
            int n = scanner.nextInt();

            if (n%2 == 0) {
                System.out.println(n+" is even number");
            }else {
                System.out.println(n+" is odd number");
            }
    }
}
