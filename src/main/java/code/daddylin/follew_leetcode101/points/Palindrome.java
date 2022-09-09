package code.daddylin.follew_leetcode101.points;

public class Palindrome {
    public boolean validPalindrome(String s) {
        int l = 0;
        final char[] chars = s.toCharArray();
        int r = chars.length - 1;
        int chance = 1;

        while (l <= r) {
            if (chars[l] == chars[r] || chars[l + 1] == chars[r] && chars[l] == chars[r - 1]) {
                l++;
                r--;
            } else {
                if (chars[l + 1] == chars[r]) {
                    l++;
                    chance--;
                } else if (chars[l] == chars[r - 1]) {
                    r--;
                    chance--;
                } else {
                    return false;
                }
                if (chance < 0) {
                    return false;
                }
            }

        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println(new Palindrome().validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
        System.out.println(new Palindrome().validPalindrome("ebcbbececabbacecbbcbe"));
        System.out.println(new Palindrome().validPalindrome("aba"));
        System.out.println(new Palindrome().validPalindrome("abca"));
        System.out.println(new Palindrome().validPalindrome("abc"));
    }

}
