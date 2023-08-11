package ArrayCount;

import java.util.Arrays;

public class ArrayCount {

    public static void main(String[] args) {

        int[] arr = {10,20,5,10,40,20,5,20,5,30,10};
        Arrays.sort(arr);
        System.out.print("Sıralı dizi :"+Arrays.toString(arr));

        int counter = 0;
        int tempNum = arr[0];

        System.out.println("Tekrar sayıları");
        for(int i=0;i<arr.length;i++){
            if(i==0 || tempNum!=arr[i]){
                for (int k : arr) {
                    if (k == arr[i]) {
                        counter++;
                        tempNum = arr[i];
                    }
                }
                System.out.println(arr[i]+" sayısı "+counter+" kere tekrar edildi!");
                counter = 0;
            }
        }
    }
}

