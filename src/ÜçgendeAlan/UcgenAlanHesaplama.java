package ÜçgendeAlan;
import java.util.Scanner;
public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int a,b,c;
        double u,alan;
        System.out.print("1.Kenarı Girniz :");
        a=inp.nextInt();

        System.out.print("2.Kenarı Giriniz :");
        b=inp.nextInt();

        System.out.print("3.Kenarı Giriniz :");
        c=inp.nextInt();

        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin Alanı :"+ alan);



    }

}
