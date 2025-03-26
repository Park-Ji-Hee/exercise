// 특정문자열 제외 함수 있음 -> .replace ==> 원하는 결과값 = 해당문자열.replace(제거할문자, 대체할문자)
// ==> str = str.replace("바꿀원래문자", "바뀔문자");

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            if(letter.equals(String.valueOf(my_string.charAt(i))))  {
                continue;
            } else {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}