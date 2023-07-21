package EbobEkok;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok = 1;
        System.out.print("Birinci Sayı Girin :");
        n1 = inp.nextInt();
        System.out.print("İkinci Sayıyı Girin :");
        n2 = inp.nextInt();
        //Ebob Bulma
        if (n1 <= n2) {
            int i = n1;
            while (i > 0) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    System.out.println("Ebob :" + ebob);
                    break;
                }
                i--;
            }
        } else {
            int i = n2;
            while (i > 0) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    System.out.println("Ebob :" + ebob);
                    break;
                }
                i--;
            }
        }
        int k = 1;
        while (k <= n1 * n2) {
            if (k % n1 == 0 && k % n2 == 0) {
                ekok = k;
                System.out.print("Ekok :" + ekok);
                break;
            }
            k++;
        }


    }
}
