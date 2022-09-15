package com.bridgelabz.basics;

import java.util.Scanner;

 //Find the Largest Among Three Numbers

public class LargestNumberAmongThree {

        public static void main(String[] args) {
            int x,y,z;
            int max;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Three Numbers :   \n x = ");
            x = scanner.nextInt();
            System.out.print("y = ");
            y = scanner.nextInt();
            System.out.print("z = ");
            z = scanner.nextInt();

            max = x;
            if (y>max){
                max = y;
            }
            if (z>max){
                max = z;
            }
            System.out.println("Largest Number = "+max);
        }
}
