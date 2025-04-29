class Solution {
    public int solution(String myString, String pat) {
        String n1 = myString.toUpperCase();
        String n2 = pat.toUpperCase();
        
        int answer = 0;
        if(n1.contains(n2)) {
            answer = 1;
        }
        return answer;
    }
}