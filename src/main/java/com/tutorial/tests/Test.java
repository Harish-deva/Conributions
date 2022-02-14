package com.tutorial.tests;

import com.tutorial.lambdas.BinaryOperation;
import com.tutorial.lambdas.Streams;
import com.tutorial.lambdas.StringAssessment;
import com.tutorial.lambdas.UnaryOperation;
import com.tutorial.patterns.builder.NyPizza;
import com.tutorial.patterns.builder.Pizza;
import com.tutorial.patterns.decorator.InstrumentedSet;
import com.tutorial.patterns.general.Match;
import com.tutorial.patterns.singleton.Singleton;
import org.apache.commons.lang3.EnumUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    protected void testEnum(){
        String string_1 = "Published" ;
        String string_2 = "Publisher";
        log.info("String 1 exists ? {}", EnumUtils.isValidEnum(com.tutorial.tests.Synchronization.class,string_1));
        log.info("String 2 exists ? {}",EnumUtils.isValidEnum(com.tutorial.tests.Synchronization.class,string_2));
    }

    protected void testBuilder(){
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL).addTopping(Pizza.Topping.PEPPER).build();
    }

    protected void testSingleton(){
        Singleton.setInstance("Hello sir !");
        log.info(Singleton.getInstance());
        Singleton.setInstance("Hello Mam !");
        log.info(Singleton.getInstance());
    }

    protected void checkForRoman() {
        log.info("is I Roman {}", Match.isRoman("I"));
        log.info("is A Roman {}", Match.isRoman("A"));
    }

    protected void checkDecoration(){
        Set<String> initSet = new TreeSet<>();
        String one = "1";
        String two = "2";
        String three = "3";
        InstrumentedSet<String> times = new InstrumentedSet<>(initSet);
        times.add(one);
        times.add(one);
        times.add(two);
        times.add(three);
        times.add(three);
        log.info(String.valueOf(times.size()));
        log.info(String.valueOf(times.getCount()));
    }

    protected void testGenerics(){
        String[] arr = {"One","Two","Three"};
        Stack<String> stack = new Stack<>();
        for(String str : arr)
            stack.push(str);
        while(!stack.isEmpty())
            log.info(stack.pop().toUpperCase());
    }

  /*  protected void createList(){
        String[] arr =  {"One","Two","Three"};
        String[] arr2 =  {"Four","Five","Six"};
        int[] arr3 = {1,2,3};
        List<Object[]> list = ( List<Object[]> )Arrays.asList(arr,arr2,arr3);
        System.out.print(list.size());
    }*/

  protected void caclulator(){
      double x = Double.parseDouble("2");
      double y = Double.parseDouble("4");
      /*for (Operation op:Operation.values())
          log.info("{} of {} & {} is {} ",op,x,y,op.apply(x,y));
      for (ExtendedOperation op:ExtendedOperation.values())
          log.info("{} of {} & {} is {} ",op,x,y,op.apply(x,y));*/

  }

  protected void printSquare(){
      int x = 25;
      log.info("The square of 25 is {}", UnaryOperation.square(x));
  }

    protected void BinaryProduct(){
        int a= 25;
        int b = 35;
        log.info("The product  of 25 & 35 is {}", BinaryOperation.multiply(a,b));
    }

    protected void testNum(){
        int a= 25;
        log.info("The number 25 is {} when said it is Bigger than 100", StringAssessment.isBig(a));
    }

    protected void testStreams(){
        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();
        log.info("Built stream : ------>");
        streamBuilder.forEach(log::info);
        Stream<Integer> streamGenerated =
                Stream.generate(() -> 123).limit(10);
        String helloThrice = Stream.generate(()->"hello").limit(3).collect(Collectors.joining());
        log.info("************"+helloThrice+"************");
        log.info("Generated stream : {}",streamGenerated.collect(Collectors.toList()));
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(5);
        log.info("Iterated stream : {}",streamIterated.collect(Collectors.toList()));
        IntStream intStream = IntStream.range(2, 10);
        intStream.forEach(s->log.info("int is "+s));
    }

    protected void testStreaming(){
        log.info("Grouped Map : "+Streams.grouping());
    }

    protected void testreverse(){
      log.info("'reverseme' when reversed becomes "+Streams.reverse());
    }

    protected  void testStreamOf(){
      Streams.convertToStream();
    }

    protected void testPeculiar(){

    }

}
