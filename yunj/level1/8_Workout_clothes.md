
# 8_Workout_clothes
```java
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
```
# 설명
 여분의 옷을 가지면서 도난을 당한 친구는 사실상 아무일도 발생하지 않았기 때문에 처음에 lost와 reserve에서 제외하여 생각을 한다. 


옷을 도난 당한 친구는 4가지 상황에 놓일 수 있다. 
1) 앞번호만 여분이 있다. 
2) 뒷번호만 여분이 있다. 
3) 둘다 여분이 있다. 
4) 둘다 없다.

1,2 상황에서 최선의 선택은 그냥 옷을 가져가는것이다. 
4 상황은 신경 쓸 필요 없다. 

3 상황에 놓여있을 때 어떤 선택을 하냐에 따라 상황이 변하게 된다.

가정) 앞번호부터 옷을 챙겨준다고 하였을 때
도난당한 친구 앞번호 친구가 여분을 가지고 있다는 것은 어찌 됬든 
그 앞 친구들은 최선의 선택을 하여 여분 옷을 다 챙겼고 앞번호 친구의 옷을 가져가지 않은 것이다.

반면 뒷번호 친구의 옷은 뒤에서 필요할 수도, 필요 없을 수도 있다. 

따라서 이 상황에서 필요가 없는 앞번호 친구의 옷을 가져가야 뒤의 친구들이 여분의 옷을 가져 갈 수 있는 선택지가 생긴다.
