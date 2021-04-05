class Solution {
    public long solution(int w, int h) {
        long answer = 0;
        double y;
        for(int i = 1; i < w ; i++){
            y = i * (double)h / w ;
            answer += (long)y;
        }


        return answer * 2;
    }
}