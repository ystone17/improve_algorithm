class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[][] base124 = new int[][]{{0,1},{1,2},{2,4}};

        while(n != 0){
            n -= 1;
            sb.append(base124[n % 3][1]);
            n /= 3;
        }

        answer = sb.reverse().toString();
        return answer;
    }
}