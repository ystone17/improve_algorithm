class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split(" ");
        for (String ele : arr) {
            String[] sarr = ele.split("");
            for (int i = 0; i < sarr.length; i++) {
                if (i % 2 == 0) {
                    sarr[i] = sarr[i].toUpperCase();
                } else {
                    sarr[i] = sarr[i].toLowerCase();
                }
            }
            answer.append((String.join("", sarr)));
            answer.append(" ");
        }
        answer.deleteCharAt(answer.length() - 1);
        int n = s.length() - answer.length();
        if(n != 0){
            answer.append(new String(new char[n]).replace("\0", " "));
        }
        return answer.toString();
    }
}