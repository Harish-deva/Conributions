package com.tutorial.patterns.decorator;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ForwardingSet<T> implements Set<T> {

    private final Set<T> s;

    public ForwardingSet(Set<T> s){
        this.s = s;
    }

    public int size() {
        return s.size();
    }

    public boolean isEmpty() {
        return s.isEmpty();
    }

    public boolean contains(Object o) {
        return s.contains(o);
    }

    public  Iterator<T> iterator() {
        return s.iterator();
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T1> T1[] toArray(T1[] a) {
        return s.toArray(a);
    }

    public boolean add(T t) {
        return s.add(t);
    }

    public boolean remove(Object o) {
        return s.remove(o);
    }

    public boolean containsAll(Collection<?> c) {
        return s.containsAll(c);
    }

    public boolean addAll(Collection<? extends T> c) {
        return s.addAll(c);
    }

    public boolean retainAll(Collection<?> c) {
        return s.retainAll(c);
    }

    public boolean removeAll(Collection<?> c) {
        return s.removeAll(c);
    }

    public void clear() {
        s.clear();
    }

    @Override
    public boolean equals (Object o){
        return s.equals(o);
    }

    @Override
    public int hashCode(){
        return s.hashCode();
    }

    @Override
    public String toString(){
        return "forwardedSet::"+s.toString();
    }

}
