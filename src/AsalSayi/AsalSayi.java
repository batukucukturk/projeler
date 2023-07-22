package AsalSayi;

public class AsalSayi {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki asal sayılar:");

        for (int i = 2; i <= 100; i++) {
            boolean asal = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }

            if (asal) {
                System.out.print(i + " ");
            }
        }

        /* ALTERNATİF VERSİYON ASAL SAYI BULMA

        int e = 0;//Bölen sayısı
        for (int i = 2; i <= 100; i++) {
            for (int n = 1; n <= i; n++) {
                if (i % n == 0) {
                    e++;
                }
            }
            if (e == 2) { //asal sayıların bölen sayısı 2 tanedir. 1 ve kendisi.
                System.out.print(i + ",");
                e = 0;
            } else e = 0;
        }*/





    }
}
