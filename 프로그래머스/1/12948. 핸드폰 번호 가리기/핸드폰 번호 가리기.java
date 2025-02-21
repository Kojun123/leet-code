class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String s1 = "";
        String s2 = "";
        
        s1 = phone_number.substring(phone_number.length() - 4);
        s2 = phone_number.substring(0,phone_number.length() - 4);
        
        s2= s2.replaceAll(".","*");
        answer = s2+=s1;
        
        return answer;
    }
}