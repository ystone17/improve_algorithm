import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int spendTime;
        int job;
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            spendTime = 0;
            job = progresses[i];
            while (job < 100) {
                job += speeds[i];
                spendTime++;
            }

            if (q.isEmpty()) {
                q.add(spendTime);
                continue;
            }

            if (q.peek() < spendTime) {
                answerList.add(q.size());
                q.clear();
            }

            q.add(spendTime);
        }

        answerList.add(q.size());

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}