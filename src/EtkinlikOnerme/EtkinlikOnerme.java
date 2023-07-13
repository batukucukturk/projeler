package EtkinlikOnerme;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int heat;

        System.out.print("Hava Sıcaklığını Giriniz :");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.print("Kayak Yapmaya Gidebilirsiniz!");
        } else if (heat >= 5 && heat <= 10) {
            System.out.print("Sinemaya Gidebilirsiniz!");

        } else if (heat > 10 && heat <= 15) {
            System.out.print("Sinemaya veya Piknik Yapmaya Gidebilirsiniz!");

        } else if (heat > 15 && heat <= 25) {
            System.out.println("Piknik Yapamaya Gidebilirsiniz!");

        } else
            System.out.print("Yüzmeye Gidebilirsiniz");


    }
}
