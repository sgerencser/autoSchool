package com.welcome;

import java.util.Scanner;

public class Welcome {
    static Scanner sc = new Scanner(System.in);
    static String name;

    public static void setupName(){
        System.out.println("Enter a name:");
        name= sc.nextLine();
    }

    public static void welcome(){
        System.out.println("Hello, " + name + "!");
    }

    public static void byeBay(){
        System.out.println("Bye, " + name + "!");
    }
}
