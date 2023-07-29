package RecursivePattern;

import java.util.Scanner;

public class RecursivePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı :");
        int num = input.nextInt();
        desen1(num, num);
    }

    static void desen1(int number, int temp) {
        if (number > 0) {
            System.out.print(number + " ");
            desen1((number - 5), temp);
        } else if (number <= 0) {
            desen2(number, temp);
        }
    }

    static void desen2(int number, int temp) {
        if (temp >= number) {
            System.out.print(number + " ");
            desen2((number + 5), temp);
        }
    }
}
