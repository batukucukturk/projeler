package Palindrom;
import java.util.Scanner;
public class Palindrom {

    static boolean isPalindrom(int number) {
        int reverseNumber = 0, lastNumber, temp = number;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reverseNumber==number){
            return true;
        }else  return false;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Girin :");
        int n = inp.nextInt();
        if (isPalindrom(n)) System.out.print(n +" Palindrom Sayıdır");
        else System.out.println(n+" Palindrom Sayı Değildir.");

    }
}
