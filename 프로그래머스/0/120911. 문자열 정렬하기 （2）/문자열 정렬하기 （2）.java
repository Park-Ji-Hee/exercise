import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public String solution(String my_string) {
        String str = my_string.toLowerCase();
        
        List<String> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i ++) {
            list.add(str.substring(i, i+1));
        }
        
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        
        return sb.toString();
        
    }
}