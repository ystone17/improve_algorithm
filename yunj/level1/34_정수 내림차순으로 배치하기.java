import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] numStr = String.valueOf(n).split("");
        List<String> al = Arrays.asList(numStr);
        al.sort(Comparator.reverseOrder());
        numStr = al.toArray(new String[0]);
        answer = Long.parseLong(String.join("",numStr));
        return answer;
    }
}