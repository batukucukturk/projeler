package SayiOrtalama;

import java.util.Scanner;

public class SayiOrtalama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi,i,toplam=0,adet=0;
        System.out.print("Sayı Giriniz :");
        sayi = inp.nextInt();

        for (i=1; i <= sayi; i++) {
            if (i%3==0 && i%4==0){
                toplam+=i;
                adet++;

            }
        }System.out.println("3 ve 4'e Bölünen sayıların ortalaması :"+toplam/adet);

    }
}
