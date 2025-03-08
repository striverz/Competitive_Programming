package Collections.Map;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        //key,value (Key not in sorted order);
        HashMap<Integer,String>mpp=new HashMap<>();

        mpp.put(1,"manikanta");
        mpp.put(2,"panee");
        mpp.put(3,"mohan");

        System.out.println(mpp);
        System.out.println(mpp.get(1));

        mpp.remove(1);
        System.out.println(mpp);

        for(var key:mpp.keySet()){
            System.out.println(key+"-> "+mpp.get(key));
        }

        for(var entry:mpp.entrySet()){
            System.out.println(entry.getKey() + "->"+entry.getValue());
        }

        mpp.forEach((key,value)->{
            System.out.println(key+"->"+value);
        });



    }
}
