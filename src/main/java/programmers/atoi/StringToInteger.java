package programmers.atoi;

public class StringToInteger {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("1234"));
    }
}

class Solution {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}