import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();
		answer.add(n);
		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
				answer.add(n);
			} else {
				n = n * 3 + 1;
				answer.add(n);
			}
		}
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}