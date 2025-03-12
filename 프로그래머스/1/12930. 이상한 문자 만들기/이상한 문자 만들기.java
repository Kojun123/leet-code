class Solution {
    public String solution(String s) {
        String answer = "";
        String[] ss = {};
        ss = s.split(" ", -1);
        int c = 0;
        
        for(String i : ss) {
            for(int j=0; j<i.length(); j++) {
                if(j%2 == 0){
                  answer += Character.toUpperCase(i.charAt(j));
                } else {
                   answer += Character.toLowerCase(i.charAt(j));
                }                
            }
            c++;
            if(c!=ss.length){
                answer += " ";
            }            
        }
        
        return answer; 
    }
}