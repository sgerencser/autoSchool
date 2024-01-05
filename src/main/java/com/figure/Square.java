package com.figure;

import java.util.ArrayList;

public class Square extends Figure{
    public Square(String name, int[] firstCoordinate, int[] secondCoordinate, int[] thirdCoordinate, int[] fourthCoordinate){
        setName(name);
        ArrayList<int[]> temp = new ArrayList<>();
        temp.add(firstCoordinate);
        temp.add(secondCoordinate);
        temp.add(thirdCoordinate);
        temp.add(fourthCoordinate);
        setCoordinates(temp);
    }
    @Override
    public double calculateArea(){
        ArrayList<int[]> temp = getCoordinates();
        int[] p1 = temp.getFirst();
        int[] p2 = temp.getLast();
        double side = Math.sqrt(Math.pow((p2[0]-p1[0]),2)+Math.pow((p2[1]-p1[1]),2));
        return Math.pow(side,2);
    }

}
