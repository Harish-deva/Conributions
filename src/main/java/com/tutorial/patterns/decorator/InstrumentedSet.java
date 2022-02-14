package com.tutorial.patterns.decorator;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class InstrumentedSet<T> extends ForwardingSet<T> {

    private AtomicInteger count = new AtomicInteger();

    public InstrumentedSet(Set<T> s) {
        super(s);
    }

    public int getCount(){
        return count.get();
    }

    @Override
    public boolean add(T e){
        count.incrementAndGet();
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends T> c){
        count.addAndGet(c.size());
        return  super.addAll(c);
    }

}
