class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pp = 0;
        int yy = 0;
        String ss = s.toLowerCase();
        for(int i=0; i<ss.length(); i++) {
            char a = ss.charAt(i);
            if(a == 'p') {
                pp++;
            } else if (a == 'y') {
                yy++;
            }
        }
        if(pp == yy) {
            answer = true;
        } else {
            answer = false;
        }
                
        return answer;
    }
}