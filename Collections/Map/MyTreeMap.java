package Collections.Map;

import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 5, 2, 8, 8, 3, 5, 3};

        // Creating a TreeMap to store counts
        // Sorted order of keys
        TreeMap<Integer, Integer> mpp = new TreeMap<>();

        for(var num:numbers){
            mpp.put(num,mpp.getOrDefault(num,0)+1);

        }

        for(var key:mpp.keySet()){
            System.out.println(key+ "->"+mpp.get(key));
        }

    }
}
