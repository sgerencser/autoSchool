package com.programming;

import java.util.Arrays;
import java.util.Scanner;

public class Working_with_arrays {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //1
        int[] initial = initializeArray();
        System.out.println("enter 20 numbers:");
        for(int i = 0; i < initial.length; i++){
            initial[i] = sc.nextInt();
        }
        System.out.println("The largest number is:" +max(initial));

        //2

        String[] lines = new String[10];
        System.out.println("How many lines do you want to enter?");
        int lineNo = sc.nextInt();
        System.out.println("Enter " + lineNo + " lines");
        for(int i = 0; i<= lineNo; i++){
            lines[i] = sc.nextLine();
        }
        for(int i = lines.length-1; i>=0; i-- ){
            System.out.println(lines[i]);
        }

        //3
        String[] text = new String[10];
        int[] stringLength = new int[10];
        System.out.println("enter 10 lines of text:");
        for(int i = 0; i < 10; i++){
            text[i] = sc.nextLine();
        }
        for(int i = 0; i < text.length; i++){
            stringLength[i] = text[i].length();
            System.out.println(stringLength[i]);
        }

        //4
        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers:");
        for(int i = 0; i < 10; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i = numbers.length-1; i>=0; i-- ){
            System.out.println(numbers[i]);
        }

        //5
        int[] largeArray = new int[20];
        int[] firstSmall = new int[10];
        int[] secondSmall = new int[10];

        System.out.println("Enter 20 numbers:");
        for(int i = 0; i< largeArray.length; i++){
            largeArray[i] = sc.nextInt();
        }
        int tempPointer = 0;
        for(int i = 0; i < firstSmall.length && i < largeArray.length; i++){
            firstSmall[i] = largeArray[i];
            tempPointer++;
        }
        if(tempPointer < largeArray.length){
            for(int i = tempPointer; i < largeArray.length && i-10 < secondSmall.length; i++){
                secondSmall[i-10] = largeArray[i];
            }
        }
        for (int i : firstSmall) {
            System.out.println(i);
        }
        for (int i : secondSmall) {
            System.out.println(i);
        }

    }
    public static int[] initializeArray(){
        int[] a = new int[20];
        return a;
    }

    public static int max(int[] a){
        int maximum = a[0];
        for(int i = 0; i<a.length; i++){
            if (maximum < a[i]){
                maximum = a[i];
            }
        }
        return maximum;
    }
}
