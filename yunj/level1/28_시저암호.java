class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 97) {
                arr[i] = (char) (97 + (arr[i] - 97 + n) % 26);
            } else if (arr[i] >= 65) {
                arr[i] = (char) (65 + (arr[i] - 65 + n) % 26);
            }
        }
        answer = new String(arr);
        return answer;
    }
}