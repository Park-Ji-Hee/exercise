class Solution {
    public int solution(int num, int k) {
        int []arr = new int [Integer.toString(num).length()];
        int answer = -1;
        
        for(int i = 0; i < Integer.toString(num).length(); i++) {
            arr[i] = Integer.parseInt(Integer.toString(num).substring(i, i+1));
            if(arr[i] == k) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}