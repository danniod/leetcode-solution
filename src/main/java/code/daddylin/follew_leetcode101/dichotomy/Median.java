package code.daddylin.follew_leetcode101.dichotomy;

public class Median {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        final int m = nums1.length - 1;
        final int n = nums2.length - 1;

        if (n < m) {
            return this.findMedianSortedArrays(nums2, nums1);
        }

        int l = 0;
        int r = m;

        int mmid = r < l ? -1 : l + (r - l) / 2;
        int nmid = (m + n + 1) / 2 - mmid - 1;

        while (l <= r) {
            mmid = l + (r - l) / 2;
            nmid = (m + n + 1) / 2 - mmid - 1;
            if (mmid >= 0 && nmid < n && nums1[mmid] > nums2[nmid + 1]) {
                r = --mmid;
                nmid++;
            } else if (nmid >= 0 && mmid < m && nums1[mmid + 1] < nums2[nmid]) {
                l = ++mmid;
                nmid--;
            } else {
                break;
            }
        }

        double median = 0;
        int left = mmid < 0 ? nums2[nmid] : nmid < 0 ? nums1[mmid] : Math.max(nums1[mmid], nums2[nmid]);
        if ((m + n) % 2 == 0) {
            int right = mmid + 1 > m ? nums2[nmid + 1] : nmid + 1 > n ? nums1[mmid + 1] : Math.min(nums1[mmid + 1], nums2[nmid + 1]);
            median = right + (left - right) / 2.0;
        } else {
            median = left;
        }
        return median;


    }


    public static void main(String[] args) {

        System.out.println(new Median().findMedianSortedArrays(new int[]{3}, new int[]{-2, -1}));
        System.out.println(new Median().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }
}
