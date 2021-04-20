package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] arr = {2, 11, 4, 3, 6, 7, 8, 9};
        int target = 9;
        int[] indexSum = TwoSum(arr, target);
        System.out.println("Sum of these data on these two index will return target " + indexSum[0] + "," + indexSum[1]);
    }

    private static int[] TwoSum(int[] arr, int target) {
        Map map = new HashMap();
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(target - arr[i])) {
                map.put(arr[i], i);
            } else {
                result[1] = i;
                result[0] = (int) map.get(target - arr[i]);
                System.out.println("result data is " + arr[i] + "," + map.get(target - arr[i]));
            }
        }
        return result;
    }
}
