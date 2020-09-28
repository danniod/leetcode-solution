package code.daddylin.solution;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumProductOfThreeNumbersTest {

    private MaximumProductOfThreeNumbers maximumProductOfThreeNumbers;

    @Before
    public void setUp() throws Exception {
        this.maximumProductOfThreeNumbers = new MaximumProductOfThreeNumbers();
    }


    @Test
    public void maximumProduct() {
        int[] nums = {1, 2, 3};
        int maximumProduct = this.maximumProductOfThreeNumbers.maximumProduct(nums);
        assertEquals(6, maximumProduct);
    }


    @Test
    public void testMaximumProduct() {
        int[] nums = {1, 2, 3, 4};
        int maximumProduct = this.maximumProductOfThreeNumbers.maximumProduct(nums);
        assertEquals(24, maximumProduct);
    }

    @Test
    public void testMaximumProductCommit() {
        int[] nums = {-4, -3, -2, -1, 60};
        int maximumProduct = this.maximumProductOfThreeNumbers.maximumProduct(nums);
        assertEquals(720, maximumProduct);
    }

}