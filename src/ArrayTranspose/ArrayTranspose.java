package ArrayTranspose;


import java.util.Arrays;

public class ArrayTranspose {
    public static void main(String[] args) {
        int[][] matris = {
                {10, 15, 20, 25},
                {30, 35, 40, 45},
                {50, 55, 60, 65},
        };

        System.out.println("Matris :");
        for (int[] row : matris){
            for (int col : row){
                System.out.print(" "+col+ " ");
            }
            System.out.println();

        }

        System.out.println("Transpose :");
        for (int row = 0; row < matris[0].length; row++) {
            for (int col = 0; col < matris.length; col++) {

                System.out.print(" "+matris[col][row] + " ");

            }
            System.out.println();
        }

    }
}
