package Collections.Queue;

import java.util.ArrayDeque;

public class MyArrayDeque {
    public static void main(String[] args) {
        //FIFO First in First Out
        ArrayDeque<Integer>ad=new ArrayDeque<>();
        ad.offer(1);
        ad.offer(2);
        ad.offer(3);
        ad.offer(5);

        while(!ad.isEmpty()){
            System.out.println(ad.peek());
            ad.pop();  //or ad.poll()
        }


    }
}
