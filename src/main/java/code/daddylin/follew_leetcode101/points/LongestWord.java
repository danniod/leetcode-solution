package code.daddylin.follew_leetcode101.points;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestWord {


    public String findLongestWord(String s, List<String> dictionary) {

        dictionary.sort((a, b) -> {
            if (a.length() == b.length()) {
                for (int i = 0; i < a.length(); i++) {
                    int diff = a.charAt(i) - b.charAt(i);
                    if (diff != 0) {
                        return diff;
                    }
                }
            }
            return b.length() - a.length();
        });

        final char[] chars = s.toCharArray();

        for (String item : dictionary) {
            if (s.length() < item.length()) {
                continue;
            }
            if (s.length() == item.length()) {
                if (s.equals(item)) {
                    return item;
                } else {
                    continue;
                }
            }

            final char[] letters = item.toCharArray();
            int chopped = 0;
            for (int i = 0; i < letters.length; i++) {
                while (i + chopped < chars.length&& chars[i + chopped] != letters[i]) {
                    chopped++;
                }
            }
            if (s.length() - chopped >= item.length()) {
                return item;
            }

        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(new LongestWord().findLongestWord("abpcplea", new ArrayList<>(List.of("ale", "apple", "monkey", "plea"))));
        System.out.println(new LongestWord().findLongestWord("abpcplea", new ArrayList<>(List.of("a", "b", "c"))));
    }


}
