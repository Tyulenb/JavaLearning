package lesson10;

import java.util.ArrayList;

public class MyStackSuc extends ArrayList<Object> implements Cloneable{
    public boolean isEmpty(){
        return super.isEmpty();
    }

    public int getSize(){
        return super.size();
    }

    public Object peek(){
        return super.getFirst();
    }

    public Object pop(){
        return super.removeFirst();
    }

    public void push(Object o){
        super.addFirst(o);
    }

    @Override
    public Object clone() {
        return super.clone();
    }
}
