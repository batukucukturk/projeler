package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1, n2, select;

        System.out.print("1.Sayıyı Giriniz :");
        n1 = inp.nextInt();
        System.out.print("2.Sayıyı Giriniz :");
        n2 = inp.nextInt();

        System.out.println("Yapmak İstediğiniz İşlemi Seçiniz :");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam =" + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma =" + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma =" + (n1 * n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Hatalı giriş yaptınız.\tBir sayı 0'a bölünemez.");
                        break;
                    default:
                        System.out.print("Bölme =" + (n1 / n2));
                        break;
                }
                break;
            default:
                System.out.println("Lütfen 1-4 arası bir işlem seçiniz!!!");


        }
    }
}