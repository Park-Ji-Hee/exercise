class Solution {
    public String solution(String s) {
        String answer = "";
        int a = 0;
        
        if(s.length() % 2 == 0) {
            a = s.length()/2 - 1;
            answer = s.substring(a, a+2);
        } else {
            a = s.length()/2;
            answer = s.substring(a, a+1);
        }
        
        return answer;
    }
}