
package com.mycompany.ekob;

import java.util.Scanner;

import java.util.Scanner;

public class Ekob {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ekob = 0;
        int max;
        
        System.out.print("1. Sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayiyi giriniz: ");
        int sayi2 = scan.nextInt();
        max = sayi1 * sayi2;
       
        
        for(int i = max; i > 0; i--)
        {
            if(i % sayi1 == 0 && i % sayi2 == 0) {
                ekob = i;
            }
        }
        System.out.println("Ekob = " + ekob);
    }
}
