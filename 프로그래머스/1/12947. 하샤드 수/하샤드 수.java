class Solution {
    public boolean solution(int x) {
        int a = 0;
        int b = x;
        boolean answer = true;
        
        while (x > 0) {
        a += x % 10;
        x /= 10;
        }
        
        if (b % a != 0) {
            answer = false;
        } 
        return answer;
    }
}
