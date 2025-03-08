package Collections.Set;

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {

        //Unique Elements in any random order
        HashSet<Integer>st=new HashSet<>();
        st.add(1);
        st.add(3);
        st.add(6);
        st.add(2);
        st.add(8);
        st.add(2);
        System.out.println(st);
        System.out.println(st.size());
        st.remove(8);
        System.out.println(st);
        System.out.println(st.contains(2)); //gives true/false if element exist


        for(Integer num:st){
            System.out.println(num);
        }

        for(var num:st){
            System.out.println(num);
        }


    }
}
