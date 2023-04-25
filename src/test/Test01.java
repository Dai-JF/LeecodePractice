package test;

import java.util.Arrays;

/**
 * description: 一维数组动态求和
 *
 * @author DaiJF
 * @date 2023/4/8 - 14:15
 */
public class Test01 {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        Test01 test01 = new Test01();
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(test01.runningSum(nums)));
    }
}
