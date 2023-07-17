package CiftveDordunKatları;

import java.util.Scanner;

public class CiftveDordunKatlari {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, total=0;

        do {
            System.out.print("Sayı Giriniz :");
            a = inp.nextInt();
            if (a%4==0){
                total+=a;
            }
        } while (a % 2 == 0);
        System.out.print("Toplam : "+total);
    }
}
