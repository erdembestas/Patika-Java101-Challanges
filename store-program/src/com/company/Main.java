package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner val = new Scanner(System.in);
    //kg prices
      double  Pear = 2.14;
      double  Apple = 3.67;
      double  Tomato= 1.11;
      double  Banana= 0.95;
      double  Aubergine=5.00;

      double kgPear,kgApple,kgTomato,kgBanana,kgAubergine,totalPrice;
      System.out.println("Please enter the kilograms of the Pear: ");
      kgPear= val.nextDouble();

      System.out.println("Please enter the kilograms of the Apple: ");
      kgApple= val.nextDouble();

      System.out.println("Please enter the kilograms of the Tomato: ");
      kgTomato= val.nextDouble();

      System.out.println("Please enter the kilograms of the Banana: ");
      kgBanana= val.nextDouble();

      System.out.println("Please enter the kilograms of the Aubergine: ");
      kgAubergine=val.nextDouble();

      totalPrice= (Pear*kgPear)+(Apple*kgApple)+(Tomato*kgTomato)+(Banana*kgBanana)+(Aubergine*kgAubergine);
      System.out.println("Total price of your basket: "+totalPrice);


    }
}
