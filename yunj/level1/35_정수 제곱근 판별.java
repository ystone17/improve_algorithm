class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt((double)n);
        if (sqrt - (long)sqrt > 0 ){
            return -1;
        }
        return (long)Math.pow(sqrt + 1, 2.0);
    }
}