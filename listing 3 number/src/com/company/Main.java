package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1,num2,num3;
        System.out.println("Enter 3 number :");

        System.out.println("Num 1 :");
        num1=input.nextDouble();

        System.out.println("Num 2 :");
        num2=input.nextDouble();

        System.out.println("Num 3 :");
        num3=input.nextDouble();

        if ( (num1 > num2)  && (num1>num3)){
            if (num2>num3){
                System.out.println("num1>num2>num3");
            }else{
                System.out.println("num1>num3>num2");
            }

        }else if((num2 > num1) && (num2 > num3)){
            if (num1>num3){
                System.out.println("num2>num1>num3");
            }else{
                System.out.println("num2>num3>num1");
            }
        }else{
            if (num3>num2){
                System.out.println("num3>num2>num1");
            }else{
                System.out.println("num3>num1>num2");
            }
        }


    }
}
