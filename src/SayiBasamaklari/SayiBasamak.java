package SayiBasamaklari;

import java.util.Scanner;

public class SayiBasamak {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Girin :");
        int number = inp.nextInt();
        int basValue;
        int result=0;

        while(number!=0){
            basValue =number % 10;
            result+=basValue;
            number/=10;

        }
        System.out.println("Girilen Sayının Basamaklarının Toplamı :"+result);


        //Armstrong Sayı Bulma Programı
         /*Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }
            */


    }
}