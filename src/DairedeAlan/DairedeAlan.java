package DairedeAlan;
import java.util.Scanner;
public class DairedeAlan {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double pi,r,a,alan,cevre,dilimAlani ;
        pi=3.14;

        System.out.print("Dairenin Yarıçapını Giriniz :");
        r=inp.nextDouble();

        System.out.print("Daire Diliminin Açısını Giriniz :");
        a=inp.nextDouble();

        alan=pi*r*r;
        cevre=2*pi*r;
        dilimAlani= (alan*a)/360;

        System.out.println("Dairenin Alanı :" +alan);
        System.out.println("Dairenin Çevresi :"+cevre);
        System.out.println("Daire Diliminin Alanı :"+dilimAlani);


    }
}
