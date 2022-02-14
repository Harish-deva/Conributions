package com.tutorial.generics;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<E>  {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT=16;

    public Stack(){
        elements = (E[]) new Object[DEFAULT];
    }

    public void push(E e){
        ensureCapacity ();
        elements[size++] = e;
    }

    public E pop(){
        if(size==0)
            throw new EmptyStackException();
        E result = elements[--size];
        elements[size]=null;
        return result;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void ensureCapacity() {
        if(elements.length == size)
            Arrays.copyOf(elements,2*size+1);
    }

}
