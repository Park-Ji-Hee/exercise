import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> hs = new LinkedHashSet<>();

        for (char ch : my_string.toCharArray()) {
            if (!hs.contains(ch)) {
                hs.add(ch);
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}