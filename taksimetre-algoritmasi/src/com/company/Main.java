package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
	    double startVal=10.0, kmVal= 2.20, finalVal, distance;
        System.out.print("Add the distance :");
        distance = val.nextFloat();
        finalVal= startVal+(kmVal*distance);
        double price =(finalVal>20) ? finalVal:20;
        System.out.println("Price: "+price);


    }
}
