package com.tutorial.comparator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class compareLists {

    private static final List<String> listOne = Arrays.asList("Jack", "Tom", "Sam", "John", "James", "Jack");
    private static final List<String> listTwo = Arrays.asList("Jack", "Daniel", "Sam", "Alan", "James", "George");

    public static void main(String[] args) {
        String separator = ";";
        String sample = "JackDanielSam";
        List<String> targetUserGroup =  Stream.of(sample.split(separator))
                .collect(Collectors.toList());
        System.out.println("Final result :: "+targetUserGroup);
    }

}
