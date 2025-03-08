package Collections.List;

import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(3);
        list.addFirst(1);
        list.addLast(5);
        System.out.println(list); //[1,3,5]

        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        System.out.println(list.size());
    }
}
