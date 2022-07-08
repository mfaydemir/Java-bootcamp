

package com.mycompany.seslisessizz;


public class Seslisessizz {

    public static void main(String[] args) {
       char harf = 'h';

        switch (harf) {
            case 'a':
            case 'e':
            case 'i':
            case 'ı':
            case 'o':
            case 'ö':
            case 'ü':
            case 'u':
                System.out.println(harf + "Verilen harf seslidir");
                break;
            default:
                System.out.println(harf + "Verilen harf sessizdir");
        }
    }
}
