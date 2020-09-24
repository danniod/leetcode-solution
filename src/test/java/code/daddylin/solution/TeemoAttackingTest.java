package code.daddylin.solution;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeemoAttackingTest {

    private TeemoAttacking teemoAttacking;

    @Before
    public void setUp() throws Exception {
        this.teemoAttacking = new TeemoAttacking();
    }

    @Test
    public void findPoisonedDuration() {
        int[] timeSeries = {1,2};
        int duration =2;
        int poisonedDuration = this.teemoAttacking.findPoisonedDuration(timeSeries, duration);
        assertEquals(3, poisonedDuration);
    }

    @Test
    public void testFindPoisonedDuration() {
        int[] timeSeries = {1,4};
        int duration =2;
        int poisonedDuration = this.teemoAttacking.findPoisonedDuration(timeSeries, duration);
        assertEquals(4, poisonedDuration);
    }
}