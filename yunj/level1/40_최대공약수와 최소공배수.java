class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[]{1, 1};
        int divide = 2;
        while (n >= divide && m >= divide) {
            if (n % divide == 0 && m % divide == 0) {
                answer[0] *= divide;
                n /= divide;
                m /= divide;
            } else{
                divide = nextPrime(divide);
            }
        }
        answer[1] = answer[0] * answer[1] * n * m;
        return answer;
    }

    int nextPrime(int num) {
        while (true) {
            if (isPrime(num + 1))
                return num + 1;
            else num += 1;
        }
    }

    boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}