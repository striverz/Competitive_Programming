package Collections.Set;

import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        //Unique with the sorted order
        TreeSet<Integer>ts=new TreeSet<>();

        ts.add(6);
        ts.add(4);
        ts.add(1);
        ts.add(8);
        ts.add(10);
        ts.add(2);
        System.out.println(ts);

        for(var num:ts){
            System.out.println(num);
        }



    }
}
