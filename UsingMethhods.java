package com;

import java.util.Scanner;

public class UsingMethhods {
    public static void main(String[] args) {

        int arry[] = new int[5];
        System.out.println(" Enter numbers");
        inputArrayElement(arry);
        printArray(arry);

    }

    public static void printArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + "\t");
        }
    }

    public static void inputArrayElement(int[] y) {
        Scanner in= new Scanner(System.in);
        for (int i = 0; i < y.length; i++) {
          y[i]=in.nextInt();
        }
    }
}

