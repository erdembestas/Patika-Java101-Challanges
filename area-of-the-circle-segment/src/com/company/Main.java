package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner val= new Scanner(System.in);
    double pi=3.14, radius,angle;

    System.out.print("Please enter the radius value: ");
    radius= val.nextDouble();

    System.out.print("Please enter the angle  of the circle segment: ");
    angle= val.nextDouble();

    double area =(pi*(radius*radius)*angle)/360;
    
    System.out.println("Area of the circle: "+area);
    }
}
