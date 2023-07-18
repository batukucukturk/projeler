package Kombinasyon;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Faktöriyel Alma
        /*  int total = 1;
        System.out.print("Sayı Girin :");
        int a = input.nextInt();
        for (int i = 1; i <= a; i++) {
            total=total*i;
        }
        System.out.print(total);*/

        //Kombinasyon Programı
        int nf = 1, rf = 1, nrf = 1, c, i;
        System.out.print("N Sayısını Girin :");
        int n = input.nextInt();
        System.out.print("R Sayısı : :");
        int r = input.nextInt();

        for (i = 1; i <= n; i++) nf *= i;
        for (i = 1; i <= r; i++) rf *= i;
        for (i = 1; i <= (n - r); i++) nrf *= i;

        c = nf / (rf * nrf);
        System.out.println("N'in r'li Kombinasyonu :" + c);

    }
}
