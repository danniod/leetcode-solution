package code.daddylin.follew_leetcode101.greed;

/**
 * No. 605
 * 思路：数0的连续个数，
 * 时间复杂度：O(n)
 */
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int place = 0;
        int bed = flowerbed[0] == 0 ? 1 : 0;
        for(int flower : flowerbed) {
            if(flower == 0) {
                bed++;
            } else {
                if (bed > 2) {
                    place += (bed - 1) / 2;
                }
                bed = 0;
            }

        }
        if(bed >= 2) {
            place += bed / 2;
        }
        return place >= n;
    }

}
