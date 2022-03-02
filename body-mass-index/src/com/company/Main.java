package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner val = new Scanner(System.in);
    double kg, meter,bodyMassIndex;
    System.out.println("Please enter your height as a meter: ");
    meter= val.nextDouble();
    System.out.println("Please enter your weight as a kg: ");
    kg= val.nextDouble();
    bodyMassIndex= kg/ (meter*meter);
    System.out.println("Your body mass index: "+bodyMassIndex);
    }
}
