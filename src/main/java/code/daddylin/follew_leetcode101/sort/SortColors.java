package code.daddylin.follew_leetcode101.sort;

import java.util.Arrays;

public class SortColors {

    public void sortColors(int[] nums) {
        int[] counts = new int[3];
        for (int num : nums) {
            counts[num]++;
        }
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < counts[i]; j++) {
                nums[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,1,0,2};
        new SortColors().sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
