package programmers.centercharacter;

public class CenterCharacter {
    public static void main(String[] args) {
        Solution solution = new Solution();


        System.out.println(solution.solution("a"));
        System.out.println(solution.solution("abcde"));
        System.out.println(solution.solution("abcdefg"));
        System.out.println(solution.solution("abcdefghijklmnop"));
        System.out.println(solution.solution("qwer"));
        System.out.println(solution.solution("qwerty"));
        System.out.println(solution.solution("qwertyuiop"));
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";

        if (s.length() == 1) {
            return s;
        }
        int center = s.length() / 2;

        if (s.length() % 2 == 0) {
            // substring 방식
            answer = s.substring(center-1, center+1);

            // 나머지가 0 이면 짝수
            // charAt 방식
//            answer += s.charAt(center-1);
//            answer += s.charAt(center);

            // toCharArray 방식
//            answer += s.toCharArray()[center-1];
//            answer += s.toCharArray()[center];
        } else {
            // 그렇지 않으면 홀수

            // substring 방식
            answer = s.substring(center-1, center-1);

            // charAt
            answer += s.charAt(center);
        }

        return answer;
    }
}
