package com.programming;

public class Type_conversions {
    public static void main(String[] args) {
        //1
        int q = 21;
        int w = 8;

        int quotient = 21/8;
        int remainder = 21%8;

        System.out.println(q + " / " + w + " = " + quotient);
        System.out.println(q + " % " + w + " = " + remainder);

        //2
        System.out.println();
        int n = 86;
        int sum = 0;

        while(n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
        System.out.println(sum);

        //3
        System.out.println();
        double m = 43.2;
        m = Math.round(m);
        System.out.println((int)m);

        //4
        System.out.println();
        int a = 5;
        int b = 6;
        int c = 3;
        int tempAddAB = a+b;
        int tempSubCA = c-a;
        int tempSum = a+b+c;
        a = tempAddAB;
        b = tempSubCA;
        c = tempSum;
        System.out.println("a: " + a + "\nb: " + b + "\nc: " +c );
    }
}
