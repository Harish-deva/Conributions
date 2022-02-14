package com.tutorial.patterns.builder;

public class IndianPizza extends Pizza {

    private final boolean sauceInside;
    private final boolean extraCheese;
    private final boolean extraSpicy;

    public static class Builder extends Pizza.Builder<IndianPizza.Builder>{
        private boolean sauceInside = false;
        private boolean extraCheese = false;
        private boolean extraSpicy = false;

        public IndianPizza.Builder sauceInside(){
            sauceInside = true;
            return this;
        }

        public IndianPizza.Builder extraCheese(){
            extraCheese = true;
            return this;
        }

        public IndianPizza.Builder extraSpicy(){
            extraSpicy = true;
            return this;
        }

        @Override
        public IndianPizza build(){
            return new IndianPizza(this);
        }

        @Override
        protected IndianPizza.Builder self() {
            return this;
        }
    }

    IndianPizza(IndianPizza.Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
        extraCheese = builder.extraCheese;
        extraSpicy = builder.extraSpicy;
    }
}
