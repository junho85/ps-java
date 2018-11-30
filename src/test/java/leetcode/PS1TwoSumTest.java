package leetcode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PS1TwoSumTest {

    @Test
    public void twoSum() {
        Solution solution = new Solution();

        int[] nums = new int[]{2,7,11,15};
        int[] result = solution.twoSum(nums, 9);
        assertThat(result).contains(0).contains(1);

        nums = new int[]{3,2,4};
        result = solution.twoSum(nums, 6);
        assertThat(result).contains(1).contains(2);

        nums = new int[]{3,3};
        result = solution.twoSum(nums, 6);
        assertThat(result).contains(0).contains(1);

        nums = new int[]{2,5,5,11};
        result = solution.twoSum(nums, 10);
        assertThat(result).contains(1).contains(2);
    }
}