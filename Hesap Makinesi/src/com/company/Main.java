package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    int n1,n2,result;
    char select;
    Scanner input = new Scanner(System.in);
    System.out.println("Please choose an operator :\n+\n-\n*\n/\n:");
    select= input.next().charAt(0);
    System.out.println("Please enter the values:");
    n1= input.nextInt();
    n2= input.nextInt();

    switch (select){
        case '+':
            result= n1+n2;
            System.out.println("n1+n2 is"+result);
            break;
        case '-':
            result= n1-n2;
            System.out.println("n1-n2 is "+result);
            break;
        case '*':
            result=n1*n2;
            System.out.println("n1*n2 is "+result);
            break;
        case '/':
            result=n1/n2;
            System.out.println("n1/n2 is "+result);
            break;
        default:
            System.out.println("Invalid operator!");
            break;
    }
    }
}
