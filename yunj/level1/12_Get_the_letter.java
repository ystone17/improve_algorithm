class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        if (length % 2 == 0) {
            String res;
            res = Character.toString(s.charAt(length/2-1));
            res += Character.toString(s.charAt(length/2));
            return res;
        } else {
            return Character.toString(s.charAt(length / 2));
        }
    }
}