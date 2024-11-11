class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int b = phone_number.length();
            int c = b - 4;
        for (int i = 0; i < phone_number.length(); i++) {
            if (i < c) {
                answer += "*";
            } else {
                answer += phone_number.charAt(i);
            }
            
        }
        return answer;
    }
}