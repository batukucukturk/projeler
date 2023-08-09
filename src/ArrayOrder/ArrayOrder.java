package ArrayOrder;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayOrder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyunutu Girin :");
        int n = input.nextInt();
        int list[] = new int[n];
        int start = 1; // kaçıncı eleman oldğunu gösteren değişken
        for (int i = 0; i < list.length; i++) {
            System.out.print(start++ + ". Elamanı : ");
            int a = input.nextInt();
            list[i] = a;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));


    }

}
