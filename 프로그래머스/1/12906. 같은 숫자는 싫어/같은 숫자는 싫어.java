import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            if(i == 0 || arr[i-1] != arr[i]){
                 result.add(arr[i]);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}