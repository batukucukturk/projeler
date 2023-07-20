package HarmonikSayi;

import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double result = 0;
        System.out.print("N Sayısını Girin :");
        int n = inp.nextInt();
        for (int i = 1; i <= n; i++) {
            result += (1.0 / i);
        }
        System.out.print("Harmonik Seri :" + result);

    }
}
