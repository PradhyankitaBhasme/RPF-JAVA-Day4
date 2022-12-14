package com.bridgelabz.functional;

import java.util.Scanner;

//        2D Array
//                a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
//                standard input and printing them out to standard output.
//                b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
//                c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
//                d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
//                OutputS
//                 OutputStreamWriter to print the output to the screen.

public class Array2D {

    public static void main(String[] args) {
            int M = 2;    //rows
            int N = 3;    //columns

            Scanner scanner = new Scanner(System.in);

            int ar[][] = new  int[M][N];
            System.out.println("Enter Numbers : ");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print("ar["+i+"]["+j+"]= ");
                    ar[i][j]=scanner.nextInt();
                }
            }
            System.out.println("Printing Array : ");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(ar[i][j]+"  ");
                }
                System.out.println();
            }
    }
}
