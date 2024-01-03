package com.programming;

import java.util.Scanner;

public class Primitive_types {
    Scanner sc = new Scanner(System.in);
    public void main(String[] args) {
        printHelloName();

    }
    public void printHelloName(){
        System.out.println("Enter a name:");
        String name = this.sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
