import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            answer[i] = kkk(array, commands[i]);
        }


        return answer;
    }

     int kkk(int[] array, int[] command) {
        int start = command[0] - 1;
        int end = command[1] - 1;
        int[] tmp = new int[end - start + 1];
        for (int i = 0; i < end - start + 1; i++) {
            tmp[i] = array[i + start];
        }
        Arrays.sort(tmp);

        return tmp[command[2] - 1];
    }
}