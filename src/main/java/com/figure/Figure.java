package com.figure;

import java.util.ArrayList;

public abstract class Figure {
    private String name;
    private ArrayList<int[]> coordinates;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCoordinates(ArrayList<int[]> coordinates){
        this.coordinates = coordinates;
    }
    public  ArrayList<int[]> getCoordinates(){
        return coordinates;
    }

    public double calculateArea(){
    return 0;
    }
}