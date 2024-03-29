package com.tutorial.enums;

public enum ExtendedOperation {

    EXP("^"){
        public double apply (double x, double y){
            return Math.pow(x,y);
        }
    },
    REM("%"){
        public double apply (double x,double y){
            return x%y;
        }
    };
    private final String symbol;

    ExtendedOperation (String symbol){
        this.symbol = symbol;
    }

    public abstract double apply(double x,double y);

    @Override public String toString(){return symbol;}
}
