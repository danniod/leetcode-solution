package code.daddylin.follew_leetcode101.dichotomy;

public class SingleElement {

    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r - 2) {
            int mid = l + (r - l) / 2;
            int pair = mid % 2 == 0 ? 1 : -1;
            if (nums[mid] == nums[mid + pair]) {
                l = Math.max(mid, mid + pair) + 1;
            } else {
                r = mid;
            }
        }
        return l == r ? nums[r] : nums[l] == nums[l + 1] ? nums[r] : nums[l];
    }

    public static void main(String[] args) {

        System.out.print(new SingleElement().singleNonDuplicate(new int[]{1,1,2,2,3}));
        System.out.print(new SingleElement().singleNonDuplicate(new int[]{1,1,2,3,3}));
        System.out.println(new SingleElement().singleNonDuplicate(new int[]{1,2,2,3,3}));
        System.out.print(new SingleElement().singleNonDuplicate(new int[]{1,1,2}));
        System.out.println(new SingleElement().singleNonDuplicate(new int[]{1,2,2}));
        System.out.println(new SingleElement().singleNonDuplicate(new int[]{1}));
    }

}
