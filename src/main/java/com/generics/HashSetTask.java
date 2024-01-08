package com.generics;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class HashSetTask {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //1
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("watermelon","banana","cherry","pear","melon","blackberry","ginseng","strawberry","toffee"));
        hashSet.add("potato");
        for(String s : hashSet){
            System.out.println(s);
        }

        //2
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("watermelon","berry");
        hashMap.put("banana","grass");
        hashMap.put("cherry","berry");
        hashMap.put("pear","fruit");
        hashMap.put("melon","vegetable");
        hashMap.put("blackberry","bush");
        hashMap.put("ginseng","root");
        hashMap.put("strawberry","berry");
        hashMap.put("iris","flower");
        hashMap.put("potato","tuber");

        for(Map.Entry<String, String> entry : hashMap.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " - " + value);
        }

        //3
        HashMap<String, Cat> litter = new HashMap<>();
        Cat c1 = new Cat("Margot");
        Cat c2 = new Cat("Angel");
        Cat c3 = new Cat("Ralphie");
        Cat c4 = new Cat("Tubby");
        Cat c5 = new Cat("Fern");
        Cat c6 = new Cat("Basil");
        Cat c7 = new Cat("Jelly");
        Cat c8 = new Cat("Ruth");
        Cat c9 = new Cat("Roxie");
        Cat c10 = new Cat("Odie");

        litter.put(c1.getName(),c1);
        litter.put(c2.getName(),c2);
        litter.put(c3.getName(),c3);
        litter.put(c4.getName(),c4);
        litter.put(c5.getName(),c5);
        litter.put(c6.getName(),c6);
        litter.put(c7.getName(),c7);
        litter.put(c8.getName(),c8);
        litter.put(c9.getName(),c9);
        litter.put(c10.getName(),c10);

        for (Map.Entry<String, Cat> entry : litter.entrySet()){
            System.out.println(entry.getKey()+ " - " + entry.getValue());
        }

        //4
        for(Map.Entry<String, String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey());
        }
        //5
        for(Map.Entry<String, String> entry : hashMap.entrySet()){
            System.out.println(entry.getValue());
        }

        //6
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("String", "word");
        hashMap2.put("Boolean", true );
        hashMap2.put("Integer",  8 );
        hashMap2.put("Double", 8.1 );
        hashMap2.put("Char", 'c' );
        hashMap2.put("Float",  15.8f);
        hashMap2.put("Cat", new Cat("Lucky"));

        for(Map.Entry<String, Object> entry : hashMap2.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        //7
        ArrayList<String> diffLines = new ArrayList<>();
        diffLines.add("One");
        diffLines.add("Two");
        diffLines.add("Three");
        diffLines.add("Four");
        diffLines.add("Apple");
        System.out.println(diffLines.size());
        for(String line : diffLines){
            System.out.println(line);
        }

        //8
        ArrayList<String> longestLine = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            longestLine.add(sc.nextLine());
        }
        int longestLength = longestLine.get(0).length();
        ArrayList<Integer> foundIndex = new ArrayList<>();
        foundIndex.add(0);

        for (int i = 1; i < longestLine.size(); i++) {
            if(longestLength < longestLine.get(i).length()){
                foundIndex.clear();
                foundIndex.add(i);
                longestLength = longestLine.get(i).length();
            }
            if(longestLength == longestLine.get(i).length()){
                foundIndex.add(i);
            }
        }
        for(int i =0; i< foundIndex.size(); i++){
            System.out.println(longestLine.get(foundIndex.get(i)));
        }

        //
        ArrayList<String> shortestLine = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            shortestLine.add(sc.nextLine());
        }
        int shortestLength = shortestLine.get(0).length();
        ArrayList<Integer> foundIndex = new ArrayList<>();
        foundIndex.add(0);

        for (int i = 1; i < shortestLine.size(); i++) {
            if(shortestLength > shortestLine.get(i).length()){
                foundIndex.clear();
                foundIndex.add(i);
                shortestLength = shortestLine.get(i).length();
            }
            if(shortestLength == shortestLine.get(i).length()){
                foundIndex.add(i);
            }
        }
        for(int i =0; i< foundIndex.size(); i++){
            System.out.println(shortestLine.get(foundIndex.get(i)));
        }

        //10
        ArrayList<String> tenLines = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tenLines.add(0, sc.nextLine());
        }
        for(String element : tenLines){
            System.out.println(element);
        }

        //11
        ArrayList<String> deleteLine = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            deleteLine.add(sc.nextLine());
        }
        String temp = deleteLine.getLast();
        deleteLine.remove(deleteLine.size()-1);
        deleteLine.add(0, temp);
        for(String element : deleteLine){
            System.out.println(element);
        }

        //12
        Set<String> lWords = new HashSet<>();
        lWords.add("Leaf");
        lWords.add("Leave");
        lWords.add("Left");
        lWords.add("Look");
        lWords.add("Lose");
        lWords.add("Lost");
        lWords.add("Loss");
        lWords.add("Litter");
        lWords.add("Light");
        lWords.add("Lighter");
        lWords.add("Lag");
        lWords.add("Lamb");
        lWords.add("LAN");
        lWords.add("Large");
        lWords.add("Larger");
        lWords.add("Largest");
        lWords.add("Label");
        lWords.add("Lasagna");
        lWords.add("Ladder");
        lWords.add("Letter");

        //13
        Set<Integer> numbers = new HashSet<>();
        ThreadLocalRandom.current().ints(0,100).distinct().limit(20).forEach(numbers::add);
        ArrayList<Integer> large = new ArrayList<>();
        for(int num : numbers){
            if (num > 10){
               large.add(num);
            }
        }
        numbers.removeAll(large);
        for(int num : numbers){
            System.out.println(num);
        }

        //14
        HashMap<String, String> names = new HashMap<>();
        names.put("Jamie","Oliver");
        names.put("Johanna", "Genoveffa");
        names.put("Jeremi","Oliver");
        names.put("Odilie","Vi");
        names.put("Yaser","Frig");
        names.put("Darby","Tianna");
        names.put("Archibald","Kassandra");
        names.put("Maxine","Oliver");
        names.put("Phyllis","Finnegan");
        names.put("Harley","Tianna");

        Map<String, Integer> result = new TreeMap<>();
        for(Map.Entry<String,String> entry: names.entrySet()){
            if(result.get(entry.getValue())==null){
                result.put(entry.getValue(), 1);
            } else {
               int temp = result.get(entry.getValue());
               temp++;
               result.put(entry.getValue(), temp);
            }
        }

        for(Map.Entry<String,Integer> entry : result.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //15
        Map<String, LocalDate> birthdays = new HashMap<>();
        birthdays.put("Smith", LocalDate.of(1989, 5, 21));
        birthdays.put("Jones", LocalDate.of(2001,1,18));
        birthdays.put("William", LocalDate.of(1997,8,5));
        birthdays.put("Evans", LocalDate.of(2020,9,8));
        birthdays.put("Taylor", LocalDate.of(1889,7,15));
        birthdays.put("Walker", LocalDate.of(1975, 3,20));
        birthdays.put("Thompson", LocalDate.of(2015,7,5));
        birthdays.put("Lewis", LocalDate.of(2010,8,4));
        birthdays.put("Martin", LocalDate.of(2012,5,3));
        birthdays.put("Jackson", LocalDate.of(1996,12,1));

        ArrayList<String> toRemove = new ArrayList<>();
        for(Map.Entry<String,LocalDate> entry: birthdays.entrySet()){
            if(entry.getValue().getMonthValue() == 6 || entry.getValue().getMonthValue() == 7 || entry.getValue().getMonthValue() == 8 ){
                toRemove.add(entry.getKey());
            }
        }
        for(String entry : toRemove){
            birthdays.remove(entry);
        }

        //16
        HashMap<String, String> names2 = new HashMap<>();
        names2.put("Jamie","Oliver");
        names2.put("Johanna", "Genoveffa");
        names2.put("Jeremi","Oliver");
        names2.put("Odilie","Vi");
        names2.put("Yaser","Frig");
        names2.put("Darby","Tianna");
        names2.put("Archibald","Kassandra");
        names2.put("Maxine","Vi");
        names2.put("Phyllis","Finnegan");
        names2.put("Harley","Tianna");

        ArrayList<String> namesToRemove = new ArrayList<>();
        ArrayList<String> nameFilter = new ArrayList<>();
        for(Map.Entry<String,String> entry: names2.entrySet()){
            if(nameFilter.contains(entry.getValue())) {
                namesToRemove.add(entry.getValue());
            } else {
                nameFilter.add(entry.getValue());
            }
        }
        for(String toRemove : namesToRemove){
            namesToRemove.remove(toRemove);
        }

        //17
        HashMap<String, String> names3 = new HashMap<>();
        names3.put("Jamie","Oliver");
        names3.put("Darby", "Genoveffa");
        names3.put("Jeremi","Oliver");
        names3.put("Odilie","Vi");
        names3.put("Yaser","Frig");
        names3.put("Darby","Tianna");
        names3.put("Archibald","Kassandra");
        names3.put("Harley","Vi");
        names3.put("Phyllis","Finnegan");
        names3.put("Harley","Tianna");

        for(Map.Entry<String,String> entry : names3.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
