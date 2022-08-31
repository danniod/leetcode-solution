package code.daddylin.follew_leetcode101.greed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * No. 763
 */
public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {

        final char[] chars = s.toCharArray();
        int[][] alphabet = new int[26][2];
        for (int i = 0; i < chars.length; i++) {
            int letter = chars[i] - 'a';
            if (alphabet[letter][0] == 0) {
                // 字母首次出现的位置
                alphabet[letter][0] = i + 1;
                alphabet[letter][1] = i + 1;
            } else {
                // 字母最后出现的位置
                alphabet[letter][1] = i + 1;
            }
        }

        Arrays.sort(alphabet, Comparator.comparingInt(i -> i[0]));
        int[] region = new int[2];
        List<Integer> result = new ArrayList<>();
        for (int[] letter : alphabet) {
            if (letter[0] == 0) {
                continue;
            }

            if (letter[0] > region[1] && region[0] <= region[1] && region[0] != 0) {
                result.add(region[1] - region[0] + 1);
                region[0] = letter[0];
                region[1] = letter[1];
                continue;
            }

            if (region[0] > letter[0] || region[0] == 0) {
                region[0] = letter[0];
            }
            if (region[1] < letter[1]) {
                region[1] = letter[1];
            }
        }
        result.add(region[1] - region[0] + 1);

        return result;
    }

}
