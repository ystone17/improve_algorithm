import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(arr[0]);
        
        for(int a : arr){
            if (temp.get(temp.size()-1) != a)
                temp.add(a);
        }
        
        answer = new int[temp.size()];
        
        for(int i =0 ; i< answer.length; i++){
            answer[i] = temp.get(i);
        }
        
        return answer;
    }
}