

package com.mycompany.carpimtablosu;

import java.util.Scanner;

public class Carpimtablosu {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz");        
	int n=scanner.nextInt();
        System.out.println("Girilen sayı kaça kadar çarpılsın?");
        int y=scanner.nextInt();
        for(int i=1; i <= y; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
