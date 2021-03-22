
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char f = s.charAt(0);
        if (f == '+'){
            answer = Integer.parseInt(s.substring(1));
        } else if(f == '-'){
            answer = Integer.parseInt(s.substring(1)) * -1;
        } else{
            answer = Integer.parseInt(s);
        }
        
        
        return answer;
    }
}