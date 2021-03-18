import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        String pattern = "^[0-9]*$";
        return Pattern.matches(pattern, s);
    }
}