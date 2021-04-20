package Array;

public class MoveZerosToEnd {


    public static void main(String[] args) {
        int[] arr = {5, 0, 2, 0, 8, 11};
        int[] myArr = MoveZerosToEndOfArr(arr);
        print(myArr);

    }

    private static void print(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int[] MoveZerosToEndOfArr(int[] arr) {
        int len = arr.length;
        int j = 0;
        for (int i = 1; i < len; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0)
                j++;
        }
        return arr;
    }
}
