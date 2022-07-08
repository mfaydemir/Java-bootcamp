

package com.mycompany.faktoriyel;

import java.util.Scanner;

public class Faktoriyel {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
        int faktoriyel = 1;
        
        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        while(sayi > 0) {
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("Faktoriyel = " + faktoriyel);
    }
}
