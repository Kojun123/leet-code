import java.util.*;
class Solution {
    public String solution(String s) {
        Character[] charArray = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
        }

        Arrays.sort(charArray, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        for (char c : charArray) {
            result.append(c);
        }
     
        
        return result.toString();
    }
}