class Solution {
    public int solution(int order) {
        int answer = 0;
        int [] arr = new int [Integer.toString(order).length()];
        
        for(int i = 0; i < Integer.toString(order).length(); i++) {
            arr[i] = Integer.parseInt(Integer.toString(order).substring(i, i+1));
        }
        
        for(int i = 0; i < Integer.toString(order).length(); i++) {
            if(arr[i] == 3 || arr[i] == 6 || arr[i] == 9) {
                answer++;
            }
        }
        
        return answer;
    }
}