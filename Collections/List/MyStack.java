package Collections.List;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        //Last In First Out
        Stack<Integer>st=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }

        //st.peek() gives the top element from stack
    }
}
