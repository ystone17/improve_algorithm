import java.util.HashMap;

class Solution {
    public String solution(int[] numbers, String hand) {
        HashMap<Integer, xy> xyMap = new HashMap<>();
        xyMap.put(1, new xy(0, 0));
        xyMap.put(2, new xy(1, 0));
        xyMap.put(3, new xy(2, 0));
        xyMap.put(4, new xy(0, 1));
        xyMap.put(5, new xy(1, 1));
        xyMap.put(6, new xy(2, 1));
        xyMap.put(7, new xy(0, 2));
        xyMap.put(8, new xy(1, 2));
        xyMap.put(9, new xy(2, 2));
        xyMap.put(0, new xy(1, 3));

        xy l = new xy(0, 3);
        xy r = new xy(2, 3);

        StringBuilder sb = new StringBuilder();

        for (int num : numbers) {
            if(num == 1 ||num == 4 ||num == 7 ){
                l = xyMap.get(num);
                sb.append("L");
            } else if(num == 3 ||num == 6 ||num == 9 ){
                r = xyMap.get(num);
                sb.append("R");
            } else {
                xy target = xyMap.get(num);
                if(l.getLength(target) < r.getLength(target) ){
                    l = xyMap.get(num);
                    sb.append("L");
                } else if (l.getLength(target) > r.getLength(target)) {
                    r = xyMap.get(num);
                    sb.append("R");
                } else{
                    if (hand.equals("left")){
                        l = xyMap.get(num);
                        sb.append("L");
                    } else {
                        r = xyMap.get(num);
                        sb.append("R");
                    }
                }

            }
        }

        return sb.toString();
    }
}

class xy {
    int x;
    int y;

    xy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getLength(xy target){
        int res = 0;
        res += Math.abs(this.x - target.x);
        res += Math.abs(this.y - target.y);
        return res;
    }
}