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
       /*int mat, turkce, kimya, fizik, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("MATEMATİK NOTUNUZU GİRİNİZ:");
        mat = input.nextInt();

        System.out.print("TÜRKÇE NOTUNUZU GİRİNİZ:");
        turkce = input.nextInt();

        System.out.print("KİMYA NOTUNUZU GİRİNİZ:");
        kimya = input.nextInt();

        System.out.print("FİZİK NOTUNUZU GİRİNİZ:");
        fizik = input.nextInt();

        System.out.print("MÜZİK NOTUNUZU GİRİNİZ:");
        muzik = input.nextInt();

        int toplamNot = 0;
        int dersSayisi = 0;
        boolean gecersizNotGirildi = false;

        if (mat >= 0 && mat <= 100) {
            toplamNot += mat;
            dersSayisi++;
        } else {
            gecersizNotGirildi = true;
            System.out.println("Geçersiz Matematik notu girdiniz.");
        }

        if (turkce >= 0 && turkce <= 100) {
            toplamNot += turkce;
            dersSayisi++;
        } else {
            gecersizNotGirildi = true;
            System.out.println("Geçersiz Türkçe notu girdiniz.");
        }

        if (kimya >= 0 && kimya <= 100) {
            toplamNot += kimya;
            dersSayisi++;
        } else {
            gecersizNotGirildi = true;
            System.out.println("Geçersiz Kimya notu girdiniz.");
        }

        if (fizik >= 0 && fizik <= 100) {
            toplamNot += fizik;
            dersSayisi++;
        } else {
            gecersizNotGirildi = true;
            System.out.println("Geçersiz Fizik notu girdiniz.");
        }

        if (muzik >= 0 && muzik <= 100) {
            toplamNot += muzik;
            dersSayisi++;
        } else {
            gecersizNotGirildi = true;
            System.out.println("Geçersiz Müzik notu girdiniz.");
        }

        if (!gecersizNotGirildi) {
            double ortalama = (double) toplamNot / dersSayisi;
            if (ortalama >= 55) {
                System.out.println("Ortalama: " + ortalama + " - Geçti");
            } else {
                System.out.println("Ortalama: " + ortalama + " - Kaldı");                 */


