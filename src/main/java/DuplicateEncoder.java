import java.util.HashSet;
import java.util.Set;

public class DuplicateEncoder {
    public static String encode(String word) {
        // to ignore capitalization
        char[] chars = word.toLowerCase().toCharArray();

        // make set to check unique
        Set<Character> set = new HashSet<>();
        Set<Character> notOnlyOnce = new HashSet<>();

        for (char c: chars) {
            if (!set.add(c)) {
                notOnlyOnce.add(c);
            }
        }

        StringBuilder result = new StringBuilder();

        for (char c: chars) {
            if (notOnlyOnce.add(c)) {
                // unique
                result.append("(");
            } else {
                // not unique
                result.append(")");
            }
        }

        return result.toString();
    }
}
