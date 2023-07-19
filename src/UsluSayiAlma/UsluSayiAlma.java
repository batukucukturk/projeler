package UsluSayiAlma;
import java.util.Scanner;
public class UsluSayiAlma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Üs Alınacak Sayı :");
        int a= inp.nextInt();
        System.out.print("Üs Olacak Sayı :");
        int b= inp.nextInt();
        int total=1;
        for (int i=1;i<=b;i++) total*=a;
        System.out.println("Sonuc :"+total);

    }
}
