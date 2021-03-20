class Solution {
    public int solution(int n) {
          int[] prime = new int[n+1];

        for(int i = 2; i<= n ; i++){
            prime[i] = 1;

            int last = (int)Math.sqrt(i * 1.0);
            for(int j = 2; j <= last; j++){
                if (i % j == 0){
                    prime[i]=0;
                    break;
                }
            }

            prime[i] += prime[i-1];
        }
        return prime[n];
    }
}