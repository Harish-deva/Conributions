package com.tutorial.patterns.singleton;

import java.util.Objects;

public class Singleton {
    private static String INSTANCE ;
    private Singleton() throws InstantiationException {
        throw new InstantiationException();
        }

    public static String getInstance() {
        return INSTANCE;
    }

    public static void setInstance(String str){
        if (Objects.isNull(INSTANCE) && Objects.nonNull(str)) {
            INSTANCE = str;
        }
    }
}