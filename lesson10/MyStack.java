package lesson10;

import java.util.ArrayList;

public class MyStack implements Cloneable{
    private ArrayList<Object> stack = new ArrayList<>();

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int getSize(){
        return stack.size();
    }

    public Object peek(){
        return stack.getFirst();
    }

    public Object pop(){
        return stack.removeFirst();
    }

    public void push(Object o){
        stack.addFirst(o);
    }

    public Object clone() {
        MyStack st = null;
        try {
            st = (MyStack)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        st.stack = (ArrayList<Object>)(stack.clone());
        return st;
    }

}