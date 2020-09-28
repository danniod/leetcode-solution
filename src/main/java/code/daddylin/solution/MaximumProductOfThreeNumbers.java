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


    public int maximumProduct(int[] nums) {

        int[] sorted = Arrays.stream(nums)
                .parallel()
                .sorted()
                .toArray();
        return Math.max(sorted[0] * sorted[1] * sorted[sorted.length - 1], sorted[sorted.length - 1] * sorted[sorted.length - 2] * sorted[sorted.length - 3]);
    }

}
