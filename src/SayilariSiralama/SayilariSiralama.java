package SayilariSiralama;

import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c ;
        System.out.print("Lütfen 1.Sayıyı Giriniz :");
        a = inp.nextInt();

        System.out.print("Lütfen 2.Sayıyı Giriniz :");
        b = inp.nextInt();

        System.out.print("Lütfen 3.Sayıyı Giriniz :");
        c = inp.nextInt();

        if (a < b && a < c) {

            if (b < c) {
                System.out.print(a + "<" + b + "<" + c);
            } else {
                System.out.print(a + "<" + c + "<" + b);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.print(b + "<" + a + "<" + c);
            } else {
                System.out.print(b + "<" + c + "<" + a);

            }

        } else if (c < a && c < b) {
            if (a < b) {
                System.out.print(c + "<" + a + "<" + b);

            } else {
                System.out.print(c + "<" + b + "<" + a);

            }

        }


    }


}

