package Array;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {5, 0, 2, 0, 8, 11};
        print(arr);
        int[] myArr = Reverse(arr);
        System.out.println("Array after reverse");
        print(myArr);

    }

    private static int[] Reverse(int[] arr) {
        int len = arr.length;
        int start = 0;
        int end = len - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    private static void print(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
