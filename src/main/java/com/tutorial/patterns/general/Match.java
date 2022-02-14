package com.tutorial.patterns.general;

import java.util.regex.Pattern;

public class Match {
    private static final Pattern ROMAN = Pattern.compile("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");

    //Always compile the pattern before matching so as to improve performance
    public static boolean isRoman(String s){
       return ROMAN.matcher(s).matches();
    }

}
