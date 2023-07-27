package RecursivePower;
import java.util.Scanner;
public class RecursivePower {

    static int pow(int a ,int b){
        if(b==0){
            return 1;
        }
        return a*pow(a, --b);



    }
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        while (true) {
            System.out.print("Taban Değerini Girin  :");
            int a = inp.nextInt();
            System.out.print("Üs Değerini Girin :");
            int b = inp.nextInt();
            System.out.println("Sonuç :" + pow(a, b));
        }


    }
}
