package PalindromString;

import java.util.Scanner;

public class PalindromString {

    static boolean isPalindrom(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrom2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelime Girin :");
        String str = input.nextLine();
        System.out.println(isPalindrom2(str));

    }
}
