package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        List<Integer> listNums = new ArrayList<>();

        for (int num : nums) {
            listNums.add(num);
        }

        int length = listNums.size();
        for (int i=0; i<listNums.size(); i++) {
            Integer num = listNums.get(i);
            List<Integer> subList = listNums.subList(i + 1, length);

            int index = subList.indexOf(target - num);
            if (index != -1) {
                result[0] = i;
                result[1] = index + i + 1;
            }
        }

        return result;
    }
}

public class PS1TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = new int[]{2,7,11,15};
        int[] result = solution.twoSum(nums, 9);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println();

        nums = new int[]{3,2,4};
        result = solution.twoSum(nums, 6);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println();
    }
}
