
import java.util.ArrayList;

class Solution {
    int[] high;
    ArrayList<Integer> bucket;
    public int solution(int[][] board, int[] moves) {
         int answer = 0;
        bucket = new ArrayList<>();
        checkHigh(board);
        for (int pick_Number : moves) {
            pick(board, pick_Number - 1);
            answer += removePair(bucket);
        }
        return answer;
    }
    
    void checkHigh(int[][] board) {
        high = new int[board.length];
        int max_size = board.length;
        for (int i =0 ; i< high.length ; i++){
            for (int j = 0; j< high.length; j++){
                if (board[j][i] != 0) {
                    high[i] = max_size - j;
                    break;
                }
            }
        }
    }
    
    void pick(int[][] board, int pick_number) {
        int h = high[pick_number];
        if (h == 0) {
            return;
        }
        bucket.add(board[board.length - h][pick_number]);
        board[board.length - h][pick_number] = 0;
        high[pick_number] = h-1;
        return;
    }
    
     int removePair(ArrayList<Integer> bucket) {
        int size = bucket.size();
        if (size < 2) {
            return 0;
        }
        int last = bucket.get(size-1);
        int last_before = bucket.get(size-2);
        if (last == last_before){
            bucket.remove(size-1);
            bucket.remove(size-2);
            return 2;
        } else{
            return 0;
        }
    }
    
}