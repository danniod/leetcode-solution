package code.daddylin.follew_leetcode101.greed;

import java.util.*;

public class QueueReconstruction {
    public int[][] reconstructQueue(int[][] people) {

        Arrays.sort(people, Comparator.comparingInt(p -> p[1]));

        List<int[]> queue = new ArrayList<>();
        queue.add(people[0]);

        for (int i = 1; i < people.length; i++) {
            int taller = people[i][1];
            int j = 0;

            while (j < i) {
                if (people[i][0] <= queue.get(j)[0]) {
                    if (taller > 0) {
                        taller--;
                    } else {
                        break;
                    }
                }
                j++;
            }
            queue.add(j, people[i]);
        }
        return queue.toArray(int[][]::new);

    }


    public int[][] reconstructQueueOpt(int[][] people) {

        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        List<int[]> queue = new LinkedList<>();
        for (int[] person : people) {
            queue.add(person[1], person);
        }
        return queue.toArray(int[][]::new);

    }


    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new QueueReconstruction().reconstructQueue(new int[][]{
                new int[]{1, 0},
                new int[]{2, 0}
        })));
        System.out.println(Arrays.deepToString(new QueueReconstruction().reconstructQueueOpt(new int[][]{
                new int[]{1, 0},
                new int[]{2, 0}
        })));
        System.out.println(Arrays.deepToString(new QueueReconstruction().reconstructQueue(new int[][]{
                new int[]{7, 0},
                new int[]{4, 4},
                new int[]{7, 1},
                new int[]{5, 0},
                new int[]{6, 1},
                new int[]{5, 2}
        })));
        System.out.println(Arrays.deepToString(new QueueReconstruction().reconstructQueueOpt(new int[][]{
                new int[]{7, 0},
                new int[]{4, 4},
                new int[]{7, 1},
                new int[]{5, 0},
                new int[]{6, 1},
                new int[]{5, 2}
        })));
        System.out.println(Arrays.deepToString(new QueueReconstruction().reconstructQueue(new int[][]{
                new int[]{6, 0},
                new int[]{5, 0},
                new int[]{4, 0},
                new int[]{3, 2},
                new int[]{2, 2},
                new int[]{1, 4}
        })));
        System.out.println(Arrays.deepToString(new QueueReconstruction().reconstructQueueOpt(new int[][]{
                new int[]{6, 0},
                new int[]{5, 0},
                new int[]{4, 0},
                new int[]{3, 2},
                new int[]{2, 2},
                new int[]{1, 4}
        })));
    }
}

