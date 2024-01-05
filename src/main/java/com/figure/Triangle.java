package com.figure;

import java.util.ArrayList;

public class Triangle extends Figure{
    public Triangle(String name, int[] firstCoordinate, int[] secondCoordinate, int[] thirdCoordinate){
        setName(name);
        ArrayList<int[]> temp = new ArrayList<>();
        temp.add(firstCoordinate);
        temp.add(secondCoordinate);
        temp.add(thirdCoordinate);
        setCoordinates(temp);
    }
    @Override
    public double calculateArea(){
        ArrayList<int[]> temp = getCoordinates();
        int[] p1 = temp.getFirst();
        int[] p2 = temp.get(1);
        int[] p3 = temp.getLast();
        double a = p1[0]*(p2[1]-p3[1]);
        double b = p2[0]*(p3[1]-p1[1]);
        double c = p3[0]*(p1[1]-p2[1]);
        return Math.abs((a+b+c)/2);
    }
}
