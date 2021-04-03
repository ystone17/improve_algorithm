import java.util.Stack;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        char[] skillArr = skill.toCharArray();
        int tmp = -1;
        boolean no = true;
        for(String user_sk : skill_trees){
            for(char sa : skillArr){
                stack.push(user_sk.indexOf(sa));
            }

            while (!stack.isEmpty()){
                if(tmp == stack.peek()){
                    stack.pop();
                } else if(tmp == -1){
                    tmp = stack.pop();
                } else if(tmp > stack.peek() && stack.peek() != -1){
                    tmp = stack.pop();
                } else{
                    no = false;
                    break;
                }
            }
            if (no){
                answer++;
            }
            tmp = -1;
            no = true;
            stack.clear();
        }
        return answer;
    }
}