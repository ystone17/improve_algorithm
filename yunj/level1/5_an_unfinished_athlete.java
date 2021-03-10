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
