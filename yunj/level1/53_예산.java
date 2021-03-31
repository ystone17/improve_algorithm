import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int total = 0;
        for(int i = 0; i < d.length ; i++){
            total += d[i];
            if (total > budget){
                break;
            }
            answer++;
        }
        
        return answer;
    }
}