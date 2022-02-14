package com.tutorial.lambdas;

import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Streams {

    private static List<String> items =
            Arrays.asList("apple", "apple", "banana",
                    "apple", "orange", "banana", "papaya");

    public static Map<String, Long> grouping(){


        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );
//result: {papaya=1, orange=1, banana=2, apple=3}

        Map<String, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and add to finalMap
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long> comparingByValue()
                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));


        return finalMap;
    }

    public static String reverse() {
        String regular = "reverseme";
        List<Character> list = regular.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static void convertToStream(){
        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Iterator to traverse the list
        Iterator<String> iterator = list.iterator();
        Stream<String> stringStream = streamOfIterator(iterator);
        stringStream.forEach(System.out::print);
    }

    public static <E> Stream<E> streamOf(Iterable<E> iterable){
        return StreamSupport.stream(iterable.spliterator(),false);
    }


    //() -> sourceIterator is nothing but new Iterable<>() { @Override public Iterator<String> iterator() { return sourceIterator; } }
    public static <E> Stream<E> streamOfIterator(Iterator<E> iterator){
        Iterable<E> iterable = () -> iterator;
        return streamOf(iterable);
    }

    public static <E> Iterable<E> iterableOf(Stream<E> stream){
        return stream::iterator;
    }

    public static Stream<BigInteger> primes(){
        return Stream.iterate(BigInteger.TWO,BigInteger::nextProbablePrime);
    }

    public static void checkStream(){
        primes().map(p->BigInteger.TWO.pow(p.intValueExact()).subtract(BigInteger.ONE))
                .filter(mersenne -> mersenne.isProbablePrime(50))
                .limit(20)
                .forEach(System.out::print);
    }

}
