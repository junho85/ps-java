public class Accumul {

    public static String accum(String s) {
        StringBuilder result = new StringBuilder();

        char[] chars = s.toCharArray();
        for (int i=0; i<chars.length; i++) {

            if (i != 0) {
                result.append("-");
            }
            char c = chars[i];
            String upper = String.valueOf(c).toUpperCase();
            String lower = String.valueOf(c).toLowerCase();

            // first
            result.append(upper);

            for (int j=1; j<i+1; j++) {
                result.append(lower);
            }
        }
        return result.toString();
    }
}
