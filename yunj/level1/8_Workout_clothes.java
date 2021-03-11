import java.util.ArrayList;
import java.util.Collections;


class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
       ArrayList<Integer> lostArr = new ArrayList<>();
        ArrayList<Integer> reserveArr = new ArrayList<>();
        ArrayList<Integer> safe = new ArrayList<>();

        for(int l : lost){
            lostArr.add(l);
        }
        for(int r : reserve){
            reserveArr.add(r);
        }

        for (int l : lostArr) {
            if(reserveArr.contains(l)){
                safe.add(l);
                reserveArr.remove(new Integer(l));
            }
        }

        for (int l : lostArr) {
            if (safe.contains(l)){
                continue;
            }
            if(reserveArr.contains(l)){
                safe.add(l);
                reserveArr.remove(new Integer(l));
                continue;
            }
            if (reserveArr.contains(l+1) ^ reserveArr.contains(l-1)){
                if (reserveArr.contains(l+1)) {
                    safe.add(l);
                    reserveArr.remove(new Integer(l+1));
                } else {
                    safe.add(l);
                    reserveArr.remove(new Integer(l-1));
                }
                continue;
            }
            if(reserveArr.contains(l+1) && reserveArr.contains(l-1)){
                safe.add(l);
                reserveArr.remove(new Integer(l-1));
            }
        }


        int answer = n - (lostArr.size() - safe.size());
        return answer;
    }
}