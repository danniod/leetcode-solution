package code.daddylin.follew_leetcode101.sort;

import java.util.*;
import java.util.stream.Collectors;

public class SortCharacters {

    public String frequencySort(String s) {

        Map<Character, Integer> counts = new HashMap<>();

        int max_count = 0;
        for (char character : s.toCharArray()) {
            final int count = counts.get(character) == null ? 1: counts.get(character) + 1;
            counts.put(character, count);
            max_count = Math.max(max_count, count);
        }

        List<Map.Entry<Character, Integer>> toSort = new ArrayList<>(counts.entrySet());
        toSort.sort((a,b) -> b.getValue() - a.getValue());
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> characterIntegerEntry : toSort) {
            sb.append(String.valueOf(characterIntegerEntry.getKey()).repeat(Math.max(0, characterIntegerEntry.getValue())));
        }
        return sb.toString();

    }


    public static void main(String[] args) {
        System.out.println(new SortCharacters().frequencySort("tree"));
        System.out.println(new SortCharacters().frequencySort("aaaccc"));
    }
}
