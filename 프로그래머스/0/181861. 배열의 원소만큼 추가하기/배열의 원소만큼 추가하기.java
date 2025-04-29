class Solution {
    public int[] solution(int[] arr) {
        int n = 0;
        for(int i = 0; i < arr.length; i ++) {
            n = n + arr[i];
        }        
        int[] answer = new int[n];
        
        int a = 0;
        for(int i = 0; i < arr.length; i ++) {
            for(int j = 0 ; j < arr[i]; j ++) {
                answer[a++] = arr[i];
            }
        }
        
        return answer;
    }
}