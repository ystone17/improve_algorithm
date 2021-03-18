class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int size = s.length();
        s = s.replaceAll("p","");
        int p = size - s.length();
        size = s.length();
        s = s.replaceAll("y","");
        int y = size - s.length();

        return p == y;
    }
}