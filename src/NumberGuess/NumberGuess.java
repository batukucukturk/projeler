package NumberGuess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        //Random rand =new Random();
        //  int number = rand.nextInt(100);
        int number = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);

        int right = 0;
        int selected;
        boolean isWrong = false;
        boolean isWin = false;
        int[] wrong = new int[5];


        while (right < 5) {
            System.out.print("Bir Sayı Girin :");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }


            if (selected == number) {
                System.out.println("Doğru tahmin! Kazandınız! \nTahmin ettiğini sayı : " + number);
                isWin = true;
                break;
            } else {
                if (selected > number) {
                    System.out.println("Gizli sayı seçtiğiniz sayıdan daha küçüktür.");

                } else {
                    System.out.println("Gizli sayı seçtiğiniz sayıdan daha büyüktür.");
                }
                wrong[right++] = selected;
                System.out.println("Yanlış tahmin yaptınız. Kalan hakkınız :" + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            System.out.println("===================");
            System.out.println("Doğru Sayı :"+number);
            System.out.println("===================");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }


    }
}
