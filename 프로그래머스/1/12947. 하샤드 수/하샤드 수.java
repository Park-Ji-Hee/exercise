class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int []arr = new int[String.valueOf(x).length()];
        int sum = 0;
        
        
        for(int i = 0; i < String.valueOf(x).length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(x).substring(i, i+1));
            sum += arr[i];
        }
        
        if(x % sum != 0) {
            answer = false;
        }
        
        
        return answer;
    }
}