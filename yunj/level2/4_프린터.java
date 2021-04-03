import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Deque<page> printer = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i< priorities.length  ; i++)  {
            printer.add(new page(i, priorities[i]));
            pq.add(priorities[i]);
        }
        int count = 1;
        while(!printer.isEmpty()){
            page tmp = printer.pollFirst();
            if (tmp.priority == pq.peek()){
                if (tmp.index == location){
                    return count;
                } else{
                    pq.poll();
                    count++;
                }
            } else{
                printer.addLast(tmp);
            }
        }




        return answer;
    }
}

class page implements Comparable<page> {
    int index;
    int priority;

    page(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }

    @Override
    public int compareTo(page p) {
        if (this.priority != p.priority){
            return this.priority < p.priority ? 1 : -1;
        } else{
            return 1;
        }
    }
}