package TersUcgen;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Girin :");
        int n = inp.nextInt();

        for (int i = n; i > 0; i--) {
            for (int k = n; k >i; k--) {
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
