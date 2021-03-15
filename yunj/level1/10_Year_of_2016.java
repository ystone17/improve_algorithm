class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] DaysOfTheWeek = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        
        int m = a - 1 ;
        int d = b - 1 ;
        
        int total = 0;
        
        for(int i =0; i< m ; i++){
            total += month[i];
        }
        
        total += d;
        
        answer = DaysOfTheWeek[total % 7];
        
        
        return answer;
    }
}