import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        int[] total = {0,0,0};

        for (int i = 0; i < answers.length ; i++) {
            if (answers[i] == one[i % 5])
                total[0] = total[0] + 1;
            if (answers[i] == two[i % 8])
                total[1] = total[1] + 1;
            if (answers[i] == three[i % 10])
                total[2] = total[2] + 1;
        }

        List<Integer> res = new ArrayList<>();

        if (total[0] >= total[1] && total[0] >= total[2]){
            res.add(1);
        }
        if (total[1] >= total[0] && total[1] >= total[2]){
            res.add(2);
        }
        if (total[2] >= total[0] && total[2] >= total[1]){
            res.add(3);
        }

        answer = new int[res.size()];
        for (int i = 0; i < res.size() ; i++) {
            answer[i] = res.get(i);
        }

        return answer;
    }
}