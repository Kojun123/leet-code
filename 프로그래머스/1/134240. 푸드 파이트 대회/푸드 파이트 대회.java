class Solution {
    public String solution(int[] food) {
         StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i];
            int half = count / 2;
            
            for (int j = 0; j < half; j++) {
                left.append(i);
            }
            for (int j = 0; j < half; j++) {
                right.append(i);
            }
        }

        return left.toString() + "0" + right.reverse().toString();
    }
}