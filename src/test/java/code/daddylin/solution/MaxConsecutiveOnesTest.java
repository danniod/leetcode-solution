package code.daddylin.solution;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MaxConsecutiveOnesTest {

    private MaxConsecutiveOnes maxConsecutiveOnes;

    @Before
    public void setup() {
        maxConsecutiveOnes = new MaxConsecutiveOnes();
    }

    @Test
    public void findMaxConsecutiveOnes() {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int maxConsecutiveOne = this.maxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        assertEquals(3, maxConsecutiveOne);
    }

    @Test
    public void testFindMaxConsecutiveOnes() {
        int[] nums = {1, 0, 1, 1, 0, 1};
        assertEquals(2, this.maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }
}