package com.figure;

public class Main {
    public static void main(String[] args) {
        Figure[] figures= new Figure[10];

        //populate the array
        figures[0] = new Circle("Circle", new int[]{7,5},new int[]{-1,5});
        figures[1] = new Square("Square", new int[]{1,4},new int[]{1,2},new int[]{3,2},new int[]{3,4});
        figures[2] = new Triangle("Triangle", new int[]{7,5},new int[]{-5,6},new int[]{8,2});
        figures[3] = new Square("Square", new int[]{-1,8},new int[]{-1,2},new int[]{5,2},new int[]{5,8});
        figures[4] = new Triangle("Triangle", new int[]{9,-10},new int[]{-5,1},new int[]{1,2});
        figures[5] = new Triangle("Triangle", new int[]{0,0},new int[]{0,3},new int[]{2,2});
        figures[6] = new Circle("Circle", new int[]{4,1},new int[]{-1,0});
        figures[7] = new Square("Square", new int[]{1,6},new int[]{1,1},new int[]{6,1},new int[]{6,6});
        figures[8] = new Circle("Circle", new int[]{9,-8},new int[]{-3,-1});
        figures[9] = new Square("Square", new int[]{1,4},new int[]{1,1},new int[]{4,1},new int[]{4,4});

        for (int i = 0; i < figures.length; i++) {
            for (int j = i+1; j < figures.length; j++) {
                if(figures[i].calculateArea() > figures[j].calculateArea()){
                    Figure temp = figures[i];
                    figures[i] = figures[j];
                    figures[j] = temp;
                }
            }
        }
        for(Figure x : figures){
            System.out.println( x.getName() + ", " + x.calculateArea());
        }
    }
}
