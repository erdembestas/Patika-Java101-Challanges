package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.print("Ucgenin sirasiyla a-b-c kenarlarini giriniz : \n");
        double a_kenari, b_kenari, c_kenari , uzunluk;
        a_kenari= val.nextInt();
        b_kenari= val.nextInt();
        c_kenari= val.nextInt();
        uzunluk = (a_kenari+b_kenari+c_kenari) /2 ;
        double alan = uzunluk*(uzunluk-a_kenari)*(uzunluk-b_kenari)*(uzunluk-c_kenari);
        alan = alan/2;
        System.out.println("Ucgenin alani: "+alan);
    }
}
