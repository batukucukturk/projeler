package ArtikYil;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl Giriniz :");
        int year = inp.nextInt();

        if ((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)) {
            System.out.print(year + "= Artık yıldır.");
        }else System.out.print(year + "= Artık Yıl Değildir.");
    }
}
