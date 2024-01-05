package com.figure;

import java.util.ArrayList;

public class Circle extends Figure{
    public Circle(String name, int[] firstCoordinate, int[] secondCoordinate){
        setName(name);
        ArrayList<int[]> temp = new ArrayList<>();
        temp.add(firstCoordinate);
        temp.add(secondCoordinate);
        setCoordinates(temp);

    }
    @Override
    public double calculateArea(){
        ArrayList<int[]> temp = getCoordinates();
        int[] p1 = temp.getFirst();
        int[] p2 = temp.getLast();
        double radius = Math.sqrt(Math.pow((p2[0]-p1[0]),2)+Math.pow((p2[1]-p1[1]),2));
        return Math.pow(radius,2) * 3.14;
    }
}
