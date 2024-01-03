package com.programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Reference_types {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       String randomString = "This is just a random string. It will be used for the practical tasks. It won't be modified";

       //1
        System.out.println("The string's 1st character:" + randomString.charAt(0));
        System.out.println("The string's last character: " + randomString.charAt(randomString.length()-1));
        if(randomString.length() %2 == 1){
            System.out.println("The character in the middle of the string: " + randomString.charAt(randomString.length()/2 +1));
        }
        int firstDot = randomString.indexOf(".");
        System.out.println("The string up to the first '.' :" + randomString.substring(0,firstDot+1));
        int numberOfSpacesInTheString = 0;
        char searchedChar= ' ';
        for(int i=0; i < randomString.length(); i++){
            if(randomString.charAt(i) == searchedChar) {
                numberOfSpacesInTheString++;
            }
        }
        System.out.println("The string has " + numberOfSpacesInTheString + " space characters in it");

        //2
        System.out.println();
        System.out.println("Enter a string:");
        String initial = sc.nextLine();
        System.out.println("Enter the specific string you want to replace in the original string:");
        String target = sc.nextLine();
        System.out.println("Enter the string you want it to be replaced with:");
        String replacement = sc.nextLine();

        int startingIndexOfTheSubstring = initial.indexOf(target);
        int lastIndexOfTheSubstring = startingIndexOfTheSubstring+ target.length();
        String correctedString = initial.substring(0,startingIndexOfTheSubstring);
        correctedString = correctedString + replacement;
        correctedString = correctedString + initial.substring(lastIndexOfTheSubstring);

        System.out.println("The corrected string is:\n" + correctedString);

        //3
        System.out.println();
        System.out.println("Enter any string:");
        String findTheLongest = sc.nextLine();
        String longest = Arrays.stream(findTheLongest.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println("The longest word in the string was: " + longest);
    }
}
