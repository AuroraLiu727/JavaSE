package com.aurora.enum_;

public class StrengthFor {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        System.out.println("普通for循环");
        //普通for循环
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("增强for循环");
        //增强for循环
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
