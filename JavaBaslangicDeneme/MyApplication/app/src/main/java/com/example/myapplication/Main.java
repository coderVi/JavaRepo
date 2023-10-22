package com.example.myapplication;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        //parmak ısındırma ve öğrenme amaçlı başlangıç ilk proje

        Scanner input = new Scanner(System.in);

        double s1, s2, s3, ort;

        System.out.println("Lütfen ilk sınav notunuzu giriniz");
        s1 = input.nextDouble();

        System.out.println("Lütfen ikinci sınav notunuzu giriniz");
        s2 = input.nextDouble();

        System.out.println("Lütfen üçüncü sınav notunuzu giriniz");
        s3 = input.nextDouble();


        ort = (s1 + s2 + s3) / 3;
        System.out.println("Sonuç : " + ort);

        if (ort <= 50){
            System.out.println("Kaldınız");
        }
        else {
            System.out.println("Geçtiniz");
        }

    }
}
