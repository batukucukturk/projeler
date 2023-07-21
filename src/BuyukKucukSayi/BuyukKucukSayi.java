package BuyukKucukSayi;

import java.util.Scanner;

public class BuyukKucukSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, number, number2, max, min, i = 1;
        System.out.print("Kaç tane sayı gireceksiniz? :");
        n = inp.nextInt();

        System.out.print("Sayı girin :");
        number = inp.nextInt();
        max = number;
        min = number;
        do {
            System.out.print("Sayı girin :");
            number = inp.nextInt();
            if (number<=min){
                min=number;
            }if (number>max){
                max=number;
            }
            i++;
        } while (i < n);
        System.out.println("En büyük sayı :"+max);
        System.out.print("En küçük sayı :"+min);

    }
}
