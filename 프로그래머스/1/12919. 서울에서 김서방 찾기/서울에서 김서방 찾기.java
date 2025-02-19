class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int a = 0;
        for(String s : seoul) {
            
            if(s.equals("Kim")) {
                break;
            } else {
                a++;
            }
        }
        answer = "김서방은 " + a + "에 있다";
        return answer;
    }
}