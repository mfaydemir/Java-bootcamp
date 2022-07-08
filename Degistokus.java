package com.mycompany.degistokus;


public class Degistokus {

    public static void main(String[] args) {
        int A=2, B=3;
        System.out.println("ilk durum");
        System.out.println("A=" +A);
        System.out.println("B=" +B);
        
        int Aktarici=A;
        
        A=B;
        
        B=Aktarici;
        
        
        System.out.println("Son durum");
        System.out.println("A=" +A);
        System.out.println("B=" +B);
    }
}
