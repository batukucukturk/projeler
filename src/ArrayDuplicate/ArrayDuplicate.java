package ArrayDuplicate;

public class ArrayDuplicate {
    static boolean isFind(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 4, 6, 3, 8, 8, 3, 7, 3, 6, 7, 8, 4, 7};
        int duplicate[] = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] % 2 == 0) {
                    if (i != j && list[i] == list[j]) {
                        if (!isFind(duplicate, list[i])) {
                            duplicate[startIndex++] = list[i];
                            break;
                        }
                    }
                }
            }
        }
        for (int value:duplicate){
            if (value!=0){
                System.out.println(value);
            }
        }


    }
}
