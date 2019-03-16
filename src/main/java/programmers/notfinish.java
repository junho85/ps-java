package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class notfinish {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] part1 = {"leo", "kiki", "eden"};
        String[] comp1 = {"eden", "kiki"};
        System.out.println(s.solution(part1, comp1).equals("leo"));

        String[] part2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] comp2 = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(s.solution(part2, comp2).equals("vinko"));

        String[] part3 = {"mislav", "stanko", "mislav", "ana"};
        String[] comp3 = {"stanko", "ana", "mislav"};
        System.out.println(s.solution(part3, comp3).equals("mislav"));
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        List<String> completionList = new ArrayList<>(Arrays.asList(completion));

        for (String part : participant) {
//            System.out.println(part);
            boolean isFound = false;
            for (int i=0; i<completionList.size(); i++) {
//                System.out.println(comp);
                if (part.equals(completionList.get(i))) {
//                    System.out.println("found");
                    completionList.remove(i);
                    isFound = true;
                    break;
                }
            }
            if (isFound == true) {
                continue;
            }
            return part;
        }
        return answer;
    }
}