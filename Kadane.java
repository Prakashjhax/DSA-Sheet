import java.util.*;

public class Kadane {
    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = nums[0];

        for (int num : nums) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maxSubArray(arr));
    }
}
