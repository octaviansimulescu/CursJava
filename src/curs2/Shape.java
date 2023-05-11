package curs2;

import static java.lang.Math.PI;

public class Shape {



    public Shape(int lenght){
        System.out.println("The area of the square is: " + calculateSquareArea(lenght));

    }

    public Shape(int lenght, int width){
        System.out.println("The area of the rectangle is: " + calculateRectangleArea(lenght,width));
    }

    public Shape(double radius){
        radius = radius * radius * PI;
        System.out.println("The area of the circle is: " + radius);
    }


    public int calculateSquareArea(int lenght){
        return lenght*lenght;
    }

    public int calculateRectangleArea(int lenght, int width){
        return lenght * width;
    }


}
