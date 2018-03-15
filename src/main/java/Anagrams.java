import java.util.LinkedList;
import java.util.List;

public class Anagrams {

    public static List<String> calculate(String s) {
        List<String> list = new LinkedList<>();
        if (s.length() == 1) {
            list.add(s);
            return list;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            List<String> smallList = calculate(getSubString(s, c));
            for (String str : smallList) {
                list.add(c + str);
            }
        }

        return list;
    }

    private static String getSubString(String s, char specialChar) {
        char[] charArray = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : charArray) {
            if (c != specialChar) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
