package Array;

public class PrintArray {


    public static void main(String[] args) {
        int[] arr = new int[5];
//        print(arr);
    }

    public void print(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
