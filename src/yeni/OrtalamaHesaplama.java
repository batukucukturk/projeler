package yeni;
import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        // kullanıcıdan değer almak için Scanner sınıfı tanımlıyoruz
        Scanner inp = new Scanner(System.in);

        //değişkenleri tanımlıyoruz
        int mat,fzk,kimya,turkce,tarih,muzik;

        System.out.print("Matematik Notunuz :");
        mat=inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fzk=inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya=inp.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce=inp.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih=inp.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik=inp.nextInt();

        int toplam =(mat+fzk+kimya+turkce+tarih+muzik);
        double ortalama= (toplam/6);
        System.out.println("Ortalamanız :"+ ortalama);

        boolean sonuc = ortalama>=60;
        String str = sonuc ? "Geçtiniz" : "Kaldınız";
        System.out.print("Sınıf Geçme Durumunuz :"+ str);

    }
}
