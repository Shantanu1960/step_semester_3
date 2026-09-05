package arrays.assigment_problems;

import java.util.*;

public class q3 {

    static int[][] threeSum(int[] nums) {
        Arrays.sort(nums);

        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate values
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {

                    list.add(new int[]{nums[i], nums[l], nums[r]});

                    l++;
                    r--;

                    // Skip duplicates
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }

                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }

                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        int[][] ans = new int[list.size()][3];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
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

        int[][] ans = threeSum(nums);

        for (int[] x : ans) {
            System.out.println(Arrays.toString(x));
        }

        sc.close();
    }
}