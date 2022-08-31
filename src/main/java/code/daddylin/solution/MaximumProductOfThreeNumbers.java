package code.daddylin.solution;

import java.util.Arrays;

/**
 * No.628 三个数的最大乘积
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 *
 * https://leetcode-cn.com/problems/maximum-product-of-three-numbers/
 *
 * @date 2020/09/25
 */
public class MaximumProductOfThreeNumbers {


    /**
     * 思路：最大乘积可以为`最大三个数之积`或`最大正数与最小两个负数之积`
     * 将给定数组排序（升序），比较数组前两个元素与最后一个元素的乘积与最后三个元素的乘积取最大值即为最大乘积
     * @param nums 给定数组
     * @return 最大乘积
     */
    public int maximumProduct(int[] nums) {

        int[] sorted = Arrays.stream(nums)
                .parallel()
                .sorted()
                .toArray();
        return Math.max(sorted[0] * sorted[1] * sorted[sorted.length - 1], sorted[sorted.length - 1] * sorted[sorted.length - 2] * sorted[sorted.length - 3]);
    }

}
