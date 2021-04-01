import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> st = new Stack<>();
        int idx = 0;
        st.push(idx);
        for (int i = 1; i < prices.length; i++) {
            while (!st.isEmpty() && prices[st.peek()] > prices[i]) {
                idx = st.pop();
                answer[idx] = i - idx;
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            idx = st.pop();
            answer[idx] = prices.length - 1 - idx;
        }

        return answer;
    }
}