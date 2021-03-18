import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        s = new String(arr);
        StringBuilder sb = new StringBuilder(s);
        return  sb.reverse().toString();
        
    }
}