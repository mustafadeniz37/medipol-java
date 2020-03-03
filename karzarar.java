package com.company;

import java.util.Scanner;

public class Company
{
    public static void main(String[] args)
    {
        System.out.println("Kar miktarını giriniz.");
        Scanner kar = new Scanner(System.in);
        int karMiktari = kar.nextInt();

        System.out.println("Zarar miktarını giriniz.");
        Scanner zarar = new Scanner(System.in);
        int zararMiktari = zarar.nextInt();

        if(karMiktari > zararMiktari) {
            System.out.println("Kar yaptınız: " + (karMiktari - zararMiktari));
        } else {
            System.out.println("Zarara uğradınız: " + (zararMiktari - karMiktari));
        }
    }
}
