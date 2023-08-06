package HarmonikOrt;

public class HarmonikOrt {
    public static void main(String[] args) {
        int[] array = {1,3,5,8,4,6};
        double hs = 0;//Harmonik seri
        for (int i = 0; i < array.length; i++) {
            hs += 1.0 / array[i];
        }
        System.out.println("Harmonik Seri :"+hs);
        System.out.println("Harmonik Ortalama :"+array.length/hs);
    }
}
