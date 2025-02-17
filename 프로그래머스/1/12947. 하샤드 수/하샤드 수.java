class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s = String.valueOf(x);
        int a = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            a += c - '0';
        }
        if(x%a == 0) {
            answer = true;
        }
        else { 
        answer = false;
        }
        return answer;
    }
}