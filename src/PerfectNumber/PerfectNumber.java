package PerfectNumber;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int result = 0;
        System.out.print("Bir Sayı Giriniz :");
        int n = inp.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                result += i;
            }
        }
        if (result == n) System.out.print(n + " Mükemmel Sayıdır");
        else System.out.print(n + " Mükemmel Sayı Değildir");

        //1-1000 Arası Mükemmel Sayılar
        /* int result = 0, k = 1,i=1;
        for (i=1; i < 1000; i++) {
            for (k = 1; k < i; k++) {
                if (i % k == 0) {
                    result += k;

                }
            }

            if (result == i) System.out.println(result);
            result=0; */
    }

}

