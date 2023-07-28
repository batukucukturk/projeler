package AsalSayiRecursive;

import java.util.Scanner;

public class AsalSayiRecursive {
    public static boolean asalsayi(int n, int i) {
        if (n <= 1) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return asalsayi(n, i - 1);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı girin :");
        int n = inp.nextInt();
        int i = n / 2;
        if (asalsayi(n, i)) {
            System.out.println(n + " asal sayıdır .");
        } else {
            System.out.println(n + " asal değildir.");
        }


    }
}
