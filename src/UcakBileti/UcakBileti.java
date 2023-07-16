package UcakBileti;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mesafe, yas, yolTipi;
        double toplam;

        System.out.print("Mesafeti Km Türünden Giriniz :");
        mesafe = inp.nextInt();
        System.out.print("Yaşınızı Giriniz :");
        yas = inp.nextInt();
        System.out.print("Yolculuk Tipini Giriniz (1=>Tek Yön - 2=> Gidiş Dönüş)");
        yolTipi = inp.nextInt();


        if (mesafe > 0 && yas > 0 && (yolTipi == 1 || yolTipi == 2)){
            toplam=mesafe*0.10;
            if (yas<12){
                toplam-=toplam*0.5;
            }if (yas>=12 && yas<=24){
                toplam-=toplam*0.1;
            }if (yas>=65){
                toplam-=toplam*0.3;
            }
            if (yolTipi==2){
                toplam-=toplam*0.2;
                toplam*=2;
            }
            System.out.print("Toplam Tutar :"+toplam);
        }else System.out.print("Hatalı Veri Girdiniz.!!");

    }
}
