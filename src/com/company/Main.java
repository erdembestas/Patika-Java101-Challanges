package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int heat;
    Scanner input = new Scanner(System.in);
    heat=input.nextInt();
    if(heat<5)
        System.out.println("Go to the skiing.");
    else if(heat>=5 && heat <15)
        System.out.println("Go to the cinema.");
    else if(heat>=15 && heat<25)
        System.out.println("Go to the picnic.");
    else
        System.out.println("Go to the swim.");
    }
}
