package Array;

public class FindMinElement {

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 7, 8, 11};
        findMinElement(arr);
    }

    private static void findMinElement(int[] arr) {
        int len = arr.length;
        int min = arr[0];
        for (int i = 0; i < len; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element is " + min);
    }
}
