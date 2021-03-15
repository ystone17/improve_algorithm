import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> third = new ArrayList<>();
        while(n != 0) {
            third.add(n % 3);
            n /= 3;
        }

        int size = third.size();
        for(int i = 0; i< size; i++){
            answer += third.get(i) * pow(3,(size-1-i));
        }

        return answer;
    }
    
    int pow(int a, int b){
        int res = 1;
        for (int i = 0; i<b; i++){
            res *= a;
        }
        return res;
    }
}