package CinZodyagı;
import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Girin :");
        int year = inp.nextInt();

        if (year%12==0) System.out.print("Maymun");
        if (year%12==1) System.out.print("Horoz");
        if (year%12==2) System.out.print("Köpek");
        if (year%12==3) System.out.print("Domuz");
        if (year%12==4) System.out.print("Fare");
        if (year%12==5) System.out.print("Öküz");
        if (year%12==6) System.out.print("Kaplan");
        if (year%12==7) System.out.print("Tavşan");
        if (year%12==8) System.out.print("Ejdarha");
        if (year%12==9) System.out.print("Yılan");
        if (year%12==10) System.out.print("At");
        if (year%12==11) System.out.print("Koyun");

    }
}
