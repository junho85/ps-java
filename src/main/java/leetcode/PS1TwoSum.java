package leetcode;

import java.util.*;

class Solution {
    /**
     * hashmap 으로 개선
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> mapNums = new HashMap<>();

        int length = nums.length;
        for (int i = 0; i < length; i++) {
            mapNums.put(nums[i], i);
        }

        for (int i = 0; i < length; i++) {
            int findNum = target - nums[i];
            Integer foundIndex = mapNums.get(findNum);
            if (foundIndex != null && foundIndex != i) {
                result[0] = i;
                result[1] = foundIndex;
                return result;
            }
        }

        return result;
    }

    /**
     * ArrayList 를 이용한 방식. 검색이 빠르지 않다.
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum_slow(int[] nums, int target) {
        int[] result = new int[2];

        List<Integer> listNums = new ArrayList<>();

        for (int num : nums) {
            listNums.add(num);
        }

        int length = listNums.size();
        for (int i=0; i<length; i++) {
            Integer num = listNums.get(i);
            List<Integer> subList = listNums.subList(i + 1, length);

            int index = subList.indexOf(target - num);
            if (index != -1) {
                result[0] = i;
                result[1] = index + i + 1;
                return result;
            }
        }

        return result;
    }
}
