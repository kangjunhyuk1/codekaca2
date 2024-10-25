class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double a = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            a += numbers[i];
        }
        int b = numbers.length;
        answer = a / b;
        return answer;
    }
}