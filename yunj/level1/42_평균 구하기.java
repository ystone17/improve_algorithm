class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double tot = 0.0;
        
        for(int a : arr){
            tot += a;
        }
        
        answer = tot / arr.length;
        
        return answer;
    }
}