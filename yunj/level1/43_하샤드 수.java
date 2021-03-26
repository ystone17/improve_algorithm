class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int origin = x;
        int d = 0;
        
        while(x != 0){
            d += x % 10;
            x /= 10;            
        }
        
        if (origin % d == 0){
            return true;
        } else{
            return false;
        }
    }
}