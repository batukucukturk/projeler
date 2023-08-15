package MineSwepper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSwepper {
    int rowNumber;
    int colNumber;
    String[][] mineMap;
    String[][] gameMap;
    int a;
    int b;
    int mineNumber;
    int count;
    boolean isTrue = true;

    public MineSwepper(int row, int col) {
        this.rowNumber = row;
        this.colNumber = col;
        this.mineMap = new String[row][col];
        this.gameMap = new String[row][col];
        this.mineNumber = (row * col) / 4;
    }

    public void mineMap() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                mineMap[i][j] = "-";
                gameMap[i][j] = "-";
            }
        }
    }

    public void randomNumber() {
        Random rnd = new Random();
        for (int i = 0; i < this.mineNumber; i++) {
            int rsayi1 = rnd.nextInt(this.rowNumber);
            int rsayi2 = rnd.nextInt(this.colNumber);
            if (!this.mineMap[rsayi1][rsayi2].equals("*")) {
                this.mineMap[rsayi1][rsayi2] = "*";
            }
        }
    }

    public void printMineMap() {
        System.out.println("Mayinlarin Konumu");
        randomNumber();
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                if (!this.mineMap[i][j].equals("*")) {
                    this.mineMap[i][j] = "-";
                }
                System.out.print(this.mineMap[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==================================");
        System.out.println("Mayin Tarlasi Oyununa Hosgeliniz !");
    }

    public void printGameMap() {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                this.gameMap[i][j] = "-";
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void control() {
        count = 0;
        for (int i = (a - 1); i <= (a + 1); i++) {
            for (int j = (b - 1); j <= (b + 1); j++) {
                if (i < 0 || j < 0 || i >= this.rowNumber || j >= this.colNumber) {
                    continue;
                }
                if (this.mineMap[i][j].equals("*")) {
                    count++;
                }
            }
        }
        this.gameMap[a][b] = String.valueOf(count);
        this.mineMap[a][b] = String.valueOf(count);
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean finish() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (this.mineMap[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void selectIndex() {
        Scanner inp = new Scanner(System.in);

        while (isTrue) {

            System.out.print("Satır Girin :");
            a = inp.nextInt();
            System.out.print("Sütun Girin :");
            b = inp.nextInt();

            if (a > rowNumber || b > colNumber) {
                System.out.println("Hatalı giriş yaptınız.");
                continue;
            }
            if (this.mineMap[a][b].equals("*")) {
                System.out.println("Oyun bitti. Kaybettiniz !");
                break;
            }
            control();
            if (finish()) {
                System.out.println("Tebrikler Oyunu Kazandınız");
                break;
            }
        }
    }

    public void run() {
        mineMap();
        printMineMap();
        printGameMap();
        selectIndex();
    }

}

