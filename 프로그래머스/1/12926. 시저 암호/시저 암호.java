class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char c : s.toCharArray()) {
            if(c == ' ') {
                answer += c;
                continue;
            }
            
            if(Character.isUpperCase(c)) {
                c = (char)((c-'A'+n) %26 + 'A');
            }
            
             else if (Character.isLowerCase(c)) {
                c = (char) ((c - 'a' + n) % 26 + 'a');
            }
            
            answer += c;

        }
        return answer;
    }
}