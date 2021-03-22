import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int n) {
        int answer = 0;
        Set<Integer> s = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                s.add(i);
            }
        }
        for (int num : s) {
            answer += num;
        }
        return answer;
    }
}