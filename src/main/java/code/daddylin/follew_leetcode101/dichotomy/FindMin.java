package code.daddylin.follew_leetcode101.dichotomy;

public class FindMin {

    public int findMin(int[] nums) {
        if (nums[0] < nums[nums.length - 1]) {
            return nums[0];
        }
        int l = 0;
        int r = nums.length - 1;
        while (l < r - 1) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == nums[r] && nums[r - 1] <= nums[r]) {
                r--;
            } else if (nums[l] == nums[mid]) {
                l++;
            } else if (nums[l] < nums[mid]) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return nums[r];
    }


    public static void main(String[] args) {
        System.out.println(new FindMin().findMin(new int[]{1, 3, 5}));
        System.out.println(new FindMin().findMin(new int[]{2, 2, 2, 0, 1}));
        System.out.println(new FindMin().findMin(new int[]{10, 1, 10, 10, 10}));
        System.out.println(new FindMin().findMin(new int[]{1, 1, 3, 1}));
    }
}
