package code.daddylin.solution;

import java.util.stream.IntStream;

/**
 * No.495 最大连续1的个数
 * 在《英雄联盟》的世界中，有一个叫 “提莫” 的英雄，他的攻击可以让敌方英雄艾希（编者注：寒冰射手）进入中毒状态。
 * 现在，给出提莫对艾希的攻击时间序列和提莫攻击的中毒持续时间，你需要输出艾希的中毒状态总时长。
 *
 * 你可以认为提莫在给定的时间点进行攻击，并立即使艾希处于中毒状态。
 *
 * https://leetcode-cn.com/problems/teemo-attacking/
 * @date 2020/09/24
 */
public class TeemoAttacking {


    public int findPoisonedDuration(int[] timeSeries, int duration) {
        return IntStream.range(0, timeSeries.length)
                .parallel()
                .map(i -> eachPoisonedDuration(timeSeries, duration, i))
                .sum();
    }


    private int eachPoisonedDuration(int[] timeSeries, int duration, int i) {
        return i == timeSeries.length - 1 || (i != timeSeries.length - 1 && timeSeries[i + 1] - timeSeries[i] > duration) ? duration : timeSeries[i + 1] - timeSeries[i];
    }

}
