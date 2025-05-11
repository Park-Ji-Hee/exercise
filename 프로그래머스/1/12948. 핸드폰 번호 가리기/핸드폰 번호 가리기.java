class Solution {
    public String solution(String phone_number) {
        String answer = phone_number;
        String str1 = phone_number.substring(phone_number.length() - 4, phone_number.length());
        String str2 = "";
        
        if(phone_number.length() != 4) {
            do {
                str2 += "*";
            } while(str2.length() < phone_number.length()-4);

            return answer = str2 + str1;
        }
        
        return answer;
    }
}