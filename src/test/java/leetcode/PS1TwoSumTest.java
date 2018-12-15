package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


public class PS1TwoSumTest {

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

            String a = "{\"for_gcm\":{\"collapse\":\"new_mail_%s_%ld\",\"delay_while_idle\":false,\"push_token\":\"%s\",\"return_url\":\"%s\",\"custom_field\":{\"message\":{\"token\":\"%s\",\"data\":{\"type\":\"MAIL\",\"userid\":\"%s\",\"folderName\":\"%s\",\"messageId\":\"%ld\",\"subject\":\"%s\",\"address\":\"%s\",\"messageDate\":\"%ld\",\"sync\":\"%s\"}}}}}";
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