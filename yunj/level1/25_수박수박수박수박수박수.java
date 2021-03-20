class Solution {
    public String solution(int n) {
        String repeat = "수박";
        String odd = "수";
        StringBuffer sb = new StringBuffer();

        int r = n / 2;
        int o = n % 2;

        for (int i= 0; i< r; i++){
            sb.append(repeat);
        }
        if (o == 1){
            sb.append(odd);
        }
        return sb.toString();
    
    }
}