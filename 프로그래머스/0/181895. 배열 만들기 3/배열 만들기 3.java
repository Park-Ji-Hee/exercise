class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int [(intervals[0][1]-intervals[0][0]+1) 
                                + (intervals[1][1]-intervals[1][0]+1)];
        int a = 0;
        
        
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            answer[a++] = arr[i];
        }

        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            answer[a++] = arr[i];
        } 
        
    
        return answer;
    }
}