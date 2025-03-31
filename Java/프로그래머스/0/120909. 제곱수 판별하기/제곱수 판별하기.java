// Math.sqrt 함수 공부하고 다시 풀기
class Solution {
    public int solution(int n) {
        int answer = 2;
        
       if(Math.sqrt(n) % 1 == 0){
            answer = 1;
        }else{
            answer = 2;
        }
        
        return answer;
    }
}