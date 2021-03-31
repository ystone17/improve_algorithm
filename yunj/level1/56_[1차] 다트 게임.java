import java.util.HashMap;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        HashMap<String, Double> pow= new HashMap<>();
        pow.put("S",1.0);
        pow.put("D",2.0);
        pow.put("T",3.0);
        int[] points = new int[3];
        String[] sp = dartResult.split("");
        int cnt = -1;
        String num ="";

        for (String s : sp) {
            if(s.matches("[0-9]")){
                num += s;
            }else if (s.matches("[S,D,T]")){
                cnt++;
                points[cnt] = (int)Math.pow(Integer.parseInt(num),pow.get(s));
                num = "";
            } else if(s.matches("[*]")){
                points[cnt] *= 2;
                try {
                    points[cnt-1] *= 2;
                } catch (ArrayIndexOutOfBoundsException e){
                }
            } else if(s.matches("[#]")){
                points[cnt] *= -1;
            }
        }

        for(int i : points){
            answer += i;
        }

        return answer;
    }
}