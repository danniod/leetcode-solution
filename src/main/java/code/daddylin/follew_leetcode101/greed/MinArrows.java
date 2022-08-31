package code.daddylin.follew_leetcode101.greed;

import java.util.Arrays;
import java.util.Comparator;

public class MinArrows {

    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int border = points[0][1];
        int arraws = 1;
        for (int[] point : points) {
            if (point[0] > border) {
                border = point[1];
                arraws++;
            }
        }
        return arraws;
    }

}
