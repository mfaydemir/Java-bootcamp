
package tekcift;

import java.util.Scanner;  // Import the Scanner class
public class Tekcift {

    
    public static void main(String[] args) {
         Scanner sayi = new Scanner(System.in);
        int tahmin;
        System.out.println("Tam sayi giriniz");
        tahmin = sayi.nextInt();
        if (tahmin %2==0){
            System.out.println("Girilen sayi cift sayidir");
        }
        
        else {
            System.out.println("Girilen sayi tek sayidir");
        }
    }
    
}
