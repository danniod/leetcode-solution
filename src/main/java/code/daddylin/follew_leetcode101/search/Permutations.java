package code.daddylin.follew_leetcode101.search;

import java.util.*;
import java.util.stream.Collectors;

public class Permutations {

    public List<List<Integer>> permuteUnique(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();
        backTracking(nums, 0, set);

        return new ArrayList<>(set);

    }

    private void backTracking(int[] nums, int level, Set<List<Integer>> set) {
        if (level == nums.length) {
            set.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return;
        }
        for (int i = level; i < nums.length; i++) {
            swap(nums, level, i);
            backTracking(nums, level + 1, set);
            swap(nums, level, i);
        }
    }

    private void swap(int[]nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


    public static void main(String[] args) {
        System.out.println(new Permutations().permuteUnique(new int[]{1, 1, 2}));
    }

}
