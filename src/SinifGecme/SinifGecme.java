package SinifGecme;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik;
        double average;

        System.out.print("Matematik Notunuzu Giriniz :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz :");
        fizik = inp.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz :");
        turkce = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz :");
        kimya = inp.nextInt();

        System.out.print("Müzik Notunuzu Giriniz :");
        muzik = inp.nextInt();

        if (mat > 100 || mat < 0) {
            average = (fizik + turkce + kimya + muzik) / 4;
        } else if (fizik > 100 || fizik < 0) {
            average = (mat + turkce + kimya + muzik) / 4;
        } else if (turkce > 100 || turkce < 0) {
            average = (fizik + mat + kimya + muzik) / 4;
        } else if (kimya > 100 || kimya < 0) {
            average = (fizik + turkce + mat + muzik) / 4;
        } else if (muzik > 100 || muzik < 0) {
            average = (fizik + turkce + kimya + mat) / 4;
        } else
            average = (mat + fizik + turkce + kimya + muzik) / 5;

        if (average < 55) {
            System.out.println("Sınıfı Geçemediniz!!");
        } else {
            System.out.println("Sınıfı Geçtiniz. Tebrikler!!");
        }
        System.out.print("Ortalamanız :" + average);

    }
}
