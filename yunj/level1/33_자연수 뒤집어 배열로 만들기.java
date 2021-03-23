class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> tmp = new ArrayList<>();

        while(n != 0){
            tmp.add((int)(n % 10));
            n /= 10;
        }

        int[] answer = new int[tmp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = tmp.get(i);
        }

        return answer;
    }
}
