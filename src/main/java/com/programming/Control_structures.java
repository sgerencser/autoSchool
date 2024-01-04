package com.programming;

import java.util.*;

public class Control_structures {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {

        //1
        int a;
        int b;
        System.out.println("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a>b?a:b);

        //2
        int c;
        int d;
        System.out.println("Enter four numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        int max = a>b?a:b;
        max = max>c?max:c;
        max = max>d?max:d;
        System.out.println(max);

        //3
        System.out.println("Enter three numbers:");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i<3; i++){
            numbers.add(sc.nextInt());
        }
        Collections.sort(numbers, Collections.reverseOrder());
        for(int i : numbers){
            System.out.println(i);
        }

        //4
        String firstName;
        String secondName;
        System.out.println("Enter two names: ");
        firstName = sc.nextLine();
        secondName = sc.nextLine();
        if(Objects.equals(firstName,secondName)){
            System.out.println("Names are identical");
        } else {
            if(firstName.length() == secondName.length()){
                System.out.println("The length of the names are equal");
            }
        }

        //5
        System.out.println("Enter your name and age");
        String name = sc.nextLine();
        int age = sc.nextInt();
        if(age < 18){
            System.out.println("Grow up more");
        }

        //6
        System.out.println("Enter your name and age");
        String anotherName = sc.nextLine();
        int anotherAge = sc.nextInt();
        if(age > 20){
            System.out.println("And 18 is enough");
        }

        //7
        int chances = 7;

        Random random = new Random();

        int secret;

        // Generate a number from 0 to 20

        secret = random.nextInt(20 + 1);
        System.out.println("Guess the number between 0 and 20");
        int guess;
        int attempts = 0;
        do{
            guess = sc.nextInt();
            if(guess < secret)
                System.out.println("Bigger");
            else if(guess > secret)
                System.out.println("Smaller");
            attempts++;
        }
        while(guess != secret && attempts <7);
        if(guess == secret)
            System.out.println("You guessed it");
        else
            System.out.println("You did not guess it");

        //8
        int counter = 1;
        while(counter <= 10){
            System.out.println(counter);
            counter ++;
        }
        //9
        counter = 10;
        while(counter >=0){
            System.out.println(counter);
            counter--;
        }

        //10
        System.out.println("Enter a string and a number");
        String toReplicate = sc.nextLine();
        int repeat = sc.nextInt();
        for (int i=0; i< repeat; i++){
            System.out.println(toReplicate);
        }

        //11
        int row = 10;
        int column = 10;
        int rowCounter = 0;
        int columnCounter;
        while(rowCounter < row){
            columnCounter = 0;
            while(columnCounter < column){
                System.out.print("S");
                columnCounter++;
            }
            System.out.println();
            rowCounter++;
        }

        //12
        int firstFactor = 1;
        int secondFactor;
        while(firstFactor <= 10 ){
            secondFactor = 1;
            while(secondFactor <= 10){
                System.out.print(firstFactor * secondFactor + " ");
                secondFactor++;
            }
            System.out.println();
            firstFactor++;
        }

        //13
        for(int i =1; i <= 100; i++)
            System.out.print(i + " ");

        //14
        System.out.println("Enter the number of rows:");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int n = sc.nextInt();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(8);
            }
            System.out.println();
        }

        //15
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(8);
            }
            System.out.println();
        }

        //16
        for(int i =0; i<10; i++){
            System.out.print(8);
        }
        for(int i =0; i<10; i++){
            System.out.println(8);
        }

        //17
        System.out.println("Enter a name: ");
        String nameToMuliply = sc.nextLine();
        for(int i = 0; i<10; i++){
            System.out.println(nameToMuliply + " loves me.");
        }

        //18
        for(int i = 30; i >=0; i--){
            System.out.println(i);
            Thread.sleep(100);
        }
        System.out.println("Boom!");
    }
}
