package com.tutorial.lambdas;

import java.util.function.BinaryOperator;

public class BinaryOperation {
    public static int multiply(int a,int b){
        BinaryOperator<Integer> product = (m1,m2)->m1+m2;
        return product.apply(a,b);
    }
}
