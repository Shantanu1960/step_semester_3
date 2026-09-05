package arrays.assigment_problems;
import java.util.Scanner;

public class q1 {

    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int left = 1;

        // Left product
        for (int i = 0; i < n; i++) {
            ans[i] = left;
            left *= nums[i];
        }

        int right = 1;

        // Right product
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = productExceptSelf(nums);

        for (int x : ans) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}