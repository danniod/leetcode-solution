package code.daddylin.solution;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * No.414 第三大的数
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 * https://leetcode-cn.com/problems/third-maximum-number/
 *
 * @date 2020/09/24
 */
public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        Supplier<IntStream> supplier =() -> Arrays.stream(nums)
                .parallel()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(3)
                .mapToInt(Integer::intValue);
        return supplier.get().count() == 3 ? supplier.get().min().orElse(0) : supplier.get().max().orElse(0);
    }

}
