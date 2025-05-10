import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            String[] arr = intStrs[i].split("");
            StringBuilder sb = new StringBuilder();
            
            for (int j = s; j < s + l; j++) {
                sb.append(arr[j]);
            }

            int num = Integer.parseInt(sb.toString());
            if (num > k) {
                list.add(num);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}