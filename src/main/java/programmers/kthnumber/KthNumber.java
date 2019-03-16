package programmers.kthnumber;

import java.util.Arrays;

public class KthNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array1 = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands1 = {
                {2, 5, 3}, {4, 4, 1}, {1, 7, 3}
        };
        int[] result1 = solution.solution(array1, commands1);
        for (int i=0; i<result1.length; i++) {
            System.out.println(result1[i]);
        }
    }
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
//        int[] answer = {};
        int[] answer = new int[commands.length];

        // command 갯수
//        System.out.println(commands.length);

        for (int idx=0; idx<commands.length; idx++) {
//            System.out.println(idx);
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];

//            System.out.println(i + " " + j + " " + kthnumber);

            // 자르기
            int[] part = Arrays.copyOfRange(array, i-1, j);

            // 정렬하기
            Arrays.sort(part);

//            for (int p : part) {
//                System.out.println(p);
//            }

            // kthnumber 번째 숫자 구하기
            answer[idx] = part[k-1];
        }


        return answer;
    }
}