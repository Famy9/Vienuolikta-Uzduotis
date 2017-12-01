package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iveskite Skaiciu:");
        Scanner skaneris = new Scanner(System.in);
        int n = skaneris.nextInt();
        System.out.println("Ka norite skaiciuoti?");
        System.out.println("1---- Suma");
        System.out.println("2---- Sandauga");
        int b = skaneris.nextInt();
        switch (b){
            case 1:
                for (int i = n; i <= n && i !=0 ; i--){
                n += i;
            }
                System.out.println(n);
                break;
            case 2:
                for (int i = n; i <= n && i !=0 ; i--){
                n *= i;
            }
                System.out.println(n);

                break;
            default:
                System.out.println("Netinkamas skaicius!");




    }
        // write your code here
    }
}
