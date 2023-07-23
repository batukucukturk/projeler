package Fibonacci;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.print("Elaman Sayısını Girin :");
        int n = inp.nextInt();
        int n1=0,n2=1;
        System.out.print(n1+","+n2+",");
        for (int j=2;j<n;j++){
            int next=n1+n2;
            System.out.print(next+",");
            n1=n2;
            n2=next;

        }


    }
}
