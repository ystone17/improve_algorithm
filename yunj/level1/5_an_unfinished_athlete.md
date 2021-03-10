# 4_Two_to_add
```java
import java.util.HashMap;
import java.util.Set;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> part = new HashMap<>();

        for (String p : participant) {
            int value = 1;
            if (part.containsKey(p)) {
                value = part.get(p) + 1;
            }
            part.put(p, value);
        }

        for (String c : completion) {
            int value = part.get(c);
            part.put(c, value - 1);
        }

        Set<String> keys = part.keySet();

        for (String key : keys) {
            if (part.get(key) == 1)
                return key;
        }

        return answer;
    }
}
```
java라서 뭔가 억울하다... 단순하게 arrayList로 로직을 짰을때 효율성 테스트 바로 광탈이라 그래 그럴 수 있지 하고..
hashmap도 당연히 안될 줄 알고 생 난리를 다 쳤는데 hash의 성능은 우월했다.

python 코드를 보니 단순히 순회탐색하는 내장함수를 써도 빨랐다.... 

---
hashmap을 이용해서 참가자 명수를 다 세준뒤 완주자를 빼주었다.
동명이인이어도 완주못한 사람은 value가 1이기때문에 value가 1인 사람을 찾았다.