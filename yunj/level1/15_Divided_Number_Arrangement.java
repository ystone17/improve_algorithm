import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        ArrayList<Integer> temp = new ArrayList<>();
        for(int a : arr){
            if (a % divisor == 0)
                temp.add(a);
        }

        if (temp.size() == 0) {
            return new int[]{-1};
        }

        Integer[] toInt = temp.toArray(new Integer[0]);
        answer = Arrays.stream(toInt).mapToInt(i -> i).toArray();
        Arrays.sort(answer);


        return answer;
    }
}