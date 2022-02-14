package com.tutorial.others;


import java.util.Optional;

public class OptionalCheck {
    public static void main(String[] args) {
        Optional<String> op = Optional.of("Hello");
        System.out.println("The optional value is :: "+op.get());
    }

}
