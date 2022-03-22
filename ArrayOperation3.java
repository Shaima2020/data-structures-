package com;
import java.util.Scanner;
import java.util.Arrays;
//Add Elements To Array
public class ArrayOperation3 {
    int x[]=new int[5];
    int numOfElements;

    public ArrayOperation3(){
//        x=new int[5];
        numOfElements=0;
    }
    public  int addElement(int e){
        if (numOfElements<x.length){
            x[numOfElements]=e;
            numOfElements++;
            return 0;
        }
    return -1;
    }

    public static void main(String[] args) {
        ArrayOperation3 test = new ArrayOperation3();
        Scanner in=new Scanner(System.in);
        System.out.println(" Input Elements");
        for (int i = 0; i <7 ; i++) {
            if (test.addElement(in.nextInt())==0)
                System.out.println("Added Successfully");
            else
                System.out.println("Array Is Full ");
            System.out.println(Arrays.toString(test.x));
        }
    }
}
