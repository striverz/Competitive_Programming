package Collections.List;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list); //[10,20,30,40,50]

        list.add(1,25); //at index 1 adding element 25
        System.out.println(list);

        System.out.println(list.size()); //gives the length of the list
        System.out.println(list.get(1)); //prints at index typed values
        System.out.println(list.contains(21)); //true/false

        list.remove(1); //removing the value at index 1

        list.clear();
        System.out.println(list);




    }
}
