class Solution {
    public int solution(int[] num_list) {
        int a = 0;
        int answer = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if(a > num_list[i]) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }
        
        return answer;
    }
}