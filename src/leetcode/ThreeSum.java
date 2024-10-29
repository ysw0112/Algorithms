package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, -4, -1, 0, 2, 1};
        process(nums);
    }

    private static void process(int[] nums) {
        int target = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                if(nums[i] + nums[left] + nums[right] == target) {
                    Arrays.asList(nums[i], nums[left], nums[right]);
                    left++;
                    right--;
                } else if(nums[i] + nums[left] + nums[right] < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
}
