package collections;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Priorityqueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        pq.offer(4);

        //ArrayList
        int index=0;
        while(!pq.isEmpty()){
            if(index<=2)
                pq.poll();
        }
    }


}
