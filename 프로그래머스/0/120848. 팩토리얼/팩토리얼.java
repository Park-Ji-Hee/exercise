class Solution {
    public int solution(int n) {
        int answer = 1;
        int a = 1;

        for (int i = 1; ; i++) {
            a *= i;
            if(a == n) {
                answer = i;
            } else if (a > n) {
                answer = i-1;
                break;
            }
        }

        return answer;
    }
}