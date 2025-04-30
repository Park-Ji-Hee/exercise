class Solution {
    public String[] solution(String[] names) {
        int n;
        if(names.length%5 != 0) {
            n = names.length/5 +1;
        } else {
            n = names.length/5;
        }
        
        String[] answer = new String[n];
        
        for (int i = 0, j = 0; j < names.length; i++, j += 5) {
            answer[i] = names[j];
        }
        
        return answer;
    }
}