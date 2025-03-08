package Collections.CustomAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CustomAlgorithms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=1;i<7;i++){
            int x;
            x=sc.nextInt();
            arr.add(x);
        }
        System.out.println(arr);

        Collections.sort(arr);
        System.out.println(arr);

        System.out.println(Collections.min(arr));
        System.out.println(Collections.max(arr));

        Collections.reverse(arr);
        System.out.println(arr);


    }
}
