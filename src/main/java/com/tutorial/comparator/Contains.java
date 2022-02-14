package com.tutorial.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contains {

    public static void main(String[] args) {
        String[] consists = {"Hello","Hi","Welcome"};
        boolean containsStr = Arrays.stream(consists).anyMatch("hello"::equals);
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("4");
        list.add("7");
        System.out.println("The String 'Hello' is contained on the array : "+Arrays.toString(list.toArray()));
    }
}
