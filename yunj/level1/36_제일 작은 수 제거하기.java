class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int[] answer = new int[arr.length - 1];
        int idx = find_min_idx(arr, 0, arr.length - 1);
        System.arraycopy(arr, 0, answer, 0, idx);
        System.arraycopy(arr, idx + 1, answer, idx, answer.length - idx);


        return answer;
    }

    int find_min_idx(int[] arr, int s, int e) {
        if (s == e) {
            return s;
        }

        int f = find_min_idx(arr, s, (s + e) / 2);
        int b = find_min_idx(arr, (s + e) / 2 + 1, e);

        if (arr[f] < arr[b]) {
            return f;
        } else {
            return b;
        }
    }
}