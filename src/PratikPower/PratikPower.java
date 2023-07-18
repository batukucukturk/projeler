package PratikPower;
import java.util.Scanner;
public class PratikPower {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,i=1,j=1;
        System.out.print("Sayı Girin :");
        n= inp.nextInt();

        do {
            System.out.println(i+"---"+j);
            i*=4;
            j*=5;
        }while (i<n && j<n);

    }
}
