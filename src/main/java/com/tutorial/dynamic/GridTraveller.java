package com.tutorial.dynamic;

import java.util.HashMap;
import java.util.Map;

public class GridTraveller {

    private static Map<String, String> cachedGridMap= new HashMap();

    public static void main(String[] args) {
        System.out.println("User always starts from right top to reach bottom left of the grid.");
        System.out.println("He/She can only move right or down to reach the destination");
        System.out.println("18*18 grid has '"+gridTravel(18,18)+"' ways to reach dest.");
    }
    
    private static int gridTravel(int rows, int cols){
        int gridTravelOutcome;
       if(rows==0 || cols==0) return 0;
       else if (rows==1 || cols==1) return 1;
       else if(cachedGridMap.containsKey(rows+":"+cols)) return Integer.parseInt(cachedGridMap.getOrDefault(rows+":"+cols,"1"));
       else if(cachedGridMap.containsKey(cols+":"+rows)) return Integer.parseInt(cachedGridMap.getOrDefault(cols+":"+rows,"1"));
       else
           gridTravelOutcome = gridTravel(rows,cols-1)+gridTravel(rows-1,cols);
           cachedGridMap.putIfAbsent(rows+":"+cols,String.valueOf(gridTravelOutcome));
           return gridTravelOutcome;
    }

}
