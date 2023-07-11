package VucutKitleIndex;
import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double boy,kilo,indeks;

        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz :");
        boy=inp.nextDouble();

        System.out.print("Lütfen Kilonuzu Kg Cinsinden Giriniz :");
        kilo=inp.nextDouble();

        indeks=kilo/(boy*boy);

        System.out.println("Vücut Kitle Endeksiniz :"+indeks);


    }
}
