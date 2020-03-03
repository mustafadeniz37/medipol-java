package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner kaydet = new Scanner(System.in);
        System.out.println("Bir sayı girin:");
        int degisken = kaydet.nextInt();
        System.out.println("Girdi: " + degisken);
		
        if(degisken == 0)
        {
            System.out.print("0 değerinin tüm pozitif kuvvetleri sıfırdır.");
        }
        else if(degisken == -1)
        {
            System.out.print("-1'in tüm pozitif tek kuvvetleri -1'e, diğer tüm pozitif çift kuvvetleri ise 1'e eşittir.");
        }
        else 
        {
            for(int i=1; i<=degisken; i++)
            {
		System.out.print("n^1");
		double hesaplama = Math.pow(i, 1);
		System.out.print(hesaplama);
		System.out.print("n^2");
		hesaplama = Math.pow(i, 2);
		System.out.print(hesaplama);
		System.out.print("n^3");
		hesaplama = Math.pow(i, 3);
		System.out.print(hesaplama);
		System.out.print("n^4");
		hesaplama = Math.pow(i, 4);
		System.out.println(hesaplama);
            }
        }
    }
}
