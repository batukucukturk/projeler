package EnYakinSayiBulma;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayiBulma {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Girin :");
        int min=0;
        int n = inp.nextInt();
        Arrays.sort(list);
        System.out.println("Sıralanmış Dizi :" + Arrays.toString(list));
        System.out.println("Girilen Sayı :" + n);

        for (int i : list) {
            if (n < i) {
                System.out.println("Girilen sayıdan büyük en yakın sayı :" + i);
                break;
            }
        }
        for(int k: list){
            if (n>k){
                min=k;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + min);





    }
}



