package code.daddylin.solution;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThirdMaximumNumberTest {

    private ThirdMaximumNumber thirdMaximumNumber;

    @Before
    public void setUp() throws Exception {
        this.thirdMaximumNumber = new ThirdMaximumNumber();
    }

    @Test
    public void thirdMax() {
        int[] nums = {3, 2, 1};
        assertEquals(1, this.thirdMaximumNumber.thirdMax(nums));
    }

    @Test
    public void testThirdMax() {
        int[] nums = {1, 2};
        assertEquals(2, this.thirdMaximumNumber.thirdMax(nums));
    }

    @Test
    public void testThirdMax1() {
        int[] nums = {2, 2, 3, 1};
        assertEquals(1, this.thirdMaximumNumber.thirdMax(nums));
    }
}