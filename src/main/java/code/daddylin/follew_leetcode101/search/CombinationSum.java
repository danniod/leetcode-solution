package code.daddylin.follew_leetcode101.search;

import java.util.*;
import java.util.stream.Collectors;

public class CombinationSum {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {


        Arrays.sort(candidates);


        List<List<Integer>> result = new ArrayList<>();

        int[] comb = new int[candidates.length];
        int[] index = new int[1];
        Arrays.sort(candidates);
        backTracking(candidates, comb, index, result, 0, target, 0);

        return result;
    }

    private void backTracking(int[] candidates, int[] comb, int[] index, List<List<Integer>> result, int level, int target, int sum) {

        if (sum == target) {
            result.add(Arrays.stream(comb).limit(index[0]).sorted().boxed().collect(Collectors.toList()));
            return;
        }
        for (int i = level; i < candidates.length && sum + candidates[i] <= target; i++) {

            if (i > level && candidates[i] == candidates[i - 1]) {
                continue;
            }
            comb[index[0]++] = candidates[i];
            sum += candidates[i];
            backTracking(candidates, comb, index, result, i + 1, target, sum);

            sum -= candidates[i];
            index[0]--;

        }

    }

    public static void main(String[] args) {
        final long began = System.currentTimeMillis();
        System.out.println(new CombinationSum().combinationSum2(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 30));
        final long end = System.currentTimeMillis();
        System.out.println(end - began);
        System.out.println(new CombinationSum().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
        System.out.println(new CombinationSum().combinationSum2(new int[]{1, 2}, 4));
    }

}
