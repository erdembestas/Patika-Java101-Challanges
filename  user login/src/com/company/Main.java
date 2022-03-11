package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	String userName, password;
    Scanner inp= new Scanner(System.in);

    System.out.println("User name:");
    userName=inp.nextLine();

    System.out.println("Password:");
    password=inp.nextLine();
    if(userName.equals("pathway") && password.equals("java"))
        System.out.println("Login success");
    else{
        System.out.println("Login failed");
    }

    }


}
