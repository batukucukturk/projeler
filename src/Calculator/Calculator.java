package Calculator;

import java.util.Scanner;

public class Calculator {
    static void sum() {
        Scanner inp = new Scanner(System.in);
        int number, i = 1, result = 0;
        while (true) {
            System.out.print(i++ + ".Sayı :");
            number = inp.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç :" + result);
        ;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static void times() {
        Scanner inp = new Scanner(System.in);
        int number, result = 1, i = 1;
        while (true) {
            System.out.print(i++ + ". Sayı :");
            number = inp.nextInt();
            if (number == 1) {
                break;
            }
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç :" + result);
    }

    static void divided() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bölünen Sayı :");
        double a = inp.nextInt();
        System.out.print("Bölen Sayı :");
        double b = inp.nextInt();
        if (b == 0) {
            System.out.print("Bölen 0 Olamaz.");

        } else {
            double result = a / b;
            System.out.println("Sonuç :" + result);
        }
    }

    static void power() {
        Scanner inp = new Scanner(System.in);
        int result = 1;
        System.out.print("Taban Sayı :");
        int a = inp.nextInt();
        System.out.print("Üs :");
        int b = inp.nextInt();
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Sonuç :" + result);
    }

    static void fact() {
        Scanner inp = new Scanner(System.in);
        int result = 1;
        System.out.print("Faktöriyeli Alınacak Sayı :");
        int a = inp.nextInt();
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Sonuç : " + result);
    }

    static void mod() {
        Scanner inp = new Scanner(System.in);
        System.out.print("1.Sayı :");
        int a = inp.nextInt();
        System.out.print("2.Sayı :");
        int b = inp.nextInt();
        int result = a % b;
        System.out.println("Sonuç :" + result);
    }
    static void calc(){
        Scanner inp =new Scanner(System.in);
        System.out.print("Kısa Kenar :");
        int a =inp.nextInt();
        System.out.print("Uzun Kenar :");
        int b = inp.nextInt();
        System.out.println("Çevre : "+ 2*(a+b));
        System.out.println("Alan :"+ a*b);

    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        while (true) {
            System.out.println(menu);
            System.out.print("Yapmak İstediğiniz İşlemi Seçin :");
            select = inp.nextInt();
            if (select == 0) {
                break;
            }
            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    System.out.print("1.Sayıyı Girin :");
                    int a = inp.nextInt();
                    System.out.print("2.Sayıyı Girin :");
                    int b = inp.nextInt();
                    System.out.println(a + " - " + b + " = " + minus(a, b));
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    fact();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    calc();
                    break;
                case 9:
                    System.out.println("Güle Güle !!");
                default:
                    System.out.println("Yanlış bir değer girdiniz.");


            }


        }
    }
}
