package Taksimetre;
import java.util.Scanner;
public class TaksimetreHesaplama {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        double km, ucret, baslangıc=10;

        System.out.print("Lütfen gidilecek mesafeyi yazınız :");
        km=inp.nextDouble();

        ucret = km * 2.20;
        ucret += baslangıc;

        ucret = (ucret<=20) ? 20 : ucret;

        System.out.print("Toplam Ücret :" + ucret);
    }
}
