class Solution {
    public int solution(int num) {
        int count = 0;

        while (count < 400 && num != 1) {
            num = (num % 2 == 0) ? num / 2 : (num * 3) + 1;
            count++;
        }

        return (num == 1) ? count : -1;


    }
}