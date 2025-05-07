import java.util.List;
import java.util.ArrayList;
class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        List<String> list = new ArrayList<String>();
        
        for (String s : arr) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        
        list.sort(null);

        return list.toArray(new String[0]);
    }
}