package com.codility.practices.before;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ToMap {

    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(0);
        List<String> books = new ArrayList<String>();
        books.add("War & Peace");
        books.add("The Shiva Trilogy");
        books.add("The Chamber");
        //Map<Integer,String> bookmap = books.stream().collect(Collectors.toMap(Integer.valueOf(counter.incrementAndGet()),book -> book));
        Map<Integer,String> bookmap =   IntStream.range(0,books.size()).boxed().collect(Collectors.toMap(i->i,books::get));
        bookmap.forEach((k,v)->System.out.println(k+" : "+v));
    }
}
