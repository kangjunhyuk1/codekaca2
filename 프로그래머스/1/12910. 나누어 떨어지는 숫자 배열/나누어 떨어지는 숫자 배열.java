import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> c = new ArrayList<>();
        
        int count = 0;
        
        for (int a : arr) {
            if (a % divisor == 0) {
                c.add(a);
                count++;
            } 
        }
        
        if(count == 0){
            int[] answer = {-1};
            return answer;
        }
        
        
        
        int[] answer = c.stream()
            .mapToInt(i -> i)
            .toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
}