package com;
import java.util.Scanner;
public class InputArray {
    public static void main(String[] args) {

        int x[]= new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println(" enter numbers");
        for (int i = 0; i <x.length ; i++) {
            x[i] = in.nextInt();
        }
            for (int i = 0; i <x.length ; i++) {
                System.out.println(x[i]);
            }
        }
    }
//input Array Elements DS lab1

